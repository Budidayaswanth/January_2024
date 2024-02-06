package org.Jan.jfs.day11;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingFileData {
    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> list = Files.readAllLines(Path.of(ReadingFileData.class.getResource("/names.txt").toURI()));
        StringBuffer data =new StringBuffer();
        for (String name :list){
            data.append(name).append(",");
        }
        System.out.println(data.subSequence(0,data.length()-1));
    }
}
