package org.java.spring_jdbc.cbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class ContactDaoImpl implements ContactDao{
    private static final String INSERT_CONTACT ="insert into contact (name,mobile,city)values(?,?,?)";
    private static final String UPDATE_CONTACT ="update contact set name =:name,mobile=:mobile,city=:city where id =:id";
    private static final String SELECT_CONTACT ="select id,name,mobile,city from contact where id =?";
    private static final String SELECT_CONTACTS ="select id,name,mobile,city from contact";
    private static final String SEARCH_CONTACTS ="select id,name,mobile,city from contact where name like ? or mobile like ? or city like ?";
    private static final String DELETE_CONTACT ="delete from contact where id =?";


@Autowired
    private JdbcTemplate jdbcTemplate;
@Autowired
private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Contact insertContact(Contact contact) {
        KeyHolder keyHolder =new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps =con.prepareStatement(INSERT_CONTACT,new String[]{"id"});
            ps.setString(1,contact.getName());
            ps.setString(2,contact.getCity());
            ps.setString(3,contact.getCity());
            return ps;
        },keyHolder);
        Number KeyObject = keyHolder.getKey();
        if (KeyObject !=null){
            long id =KeyObject.longValue();
            contact.setId(id);
        }else {
            throw new RuntimeException("contact could be inserted");
        }
        return contact;
    }

    @Override
    public Contact updateContact(Contact contact) {
        Map<String,Object> map =Map.of("id",contact.getId(),"name",contact.getName(),"mobile",contact.getMobile(),"city",contact.getCity());
        namedParameterJdbcTemplate.update(UPDATE_CONTACT,map);
        return selectContact(contact.getId());
    }

    @Override
    public List<Contact> selectContact() {
        return jdbcTemplate.query(SELECT_CONTACTS,
                new ContractRowMapper());
    }

    @Override
    public List<Contact> search(String str) {
        return jdbcTemplate.query(SEARCH_CONTACTS,
                new ContractRowMapper(),"%" + str +"%","%"+str+"%","%"+str+"%");
    }

    @Override
    public boolean deleteContact(long id) {
        return jdbcTemplate.update(DELETE_CONTACT,id)==1;
    }

    @Override
    public Contact selectContact(long id) {
        try {
            return jdbcTemplate.queryForObject(SELECT_CONTACT,new ContractRowMapper(),id);
        }catch (EmptyResultDataAccessException e){
            throw new RuntimeException(" contact with "+id +"not found ");
        }
    }

    @Override
    public int[] insertContacts(List<Contact> contacts) {

        return jdbcTemplate.batchUpdate(INSERT_CONTACT, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                if(i >=contacts.size()){
                    return;
                }
                Contact contact = contacts.get(i);
                ps.setString(1,contact.getName());
                ps.setString(2,contact.getMobile());
                ps.setString(3,contact.getCity());
            }

            @Override
            public int getBatchSize() {
                return contacts.size();
            }
        });
    }
}
