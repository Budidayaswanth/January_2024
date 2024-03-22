package org.Jan.jfs.day8;

public class ArrayExample2 {
    public static void main(String[] args) {
        String[] string = {"Krishna", "Rajesh", "Manoj", "vivek", "Krishna", "Rajesh", "Manoj", "vivek"};
        String[] uniqueName = getUniqueNames(string);
        System.out.println("Unique names are :");
        for (String name : uniqueName) {
            System.out.println(name);
        }
    }

    public static String[] getUniqueNames(String[] names) {
        String[] uniqueName = new String[names.length];
        int count = 0;
        for (String name : names) {
            if (!isPresent(uniqueName, name)) {
                uniqueName[count++] = name;
            }
        }
        String[] arr = new String[count];
        System.arraycopy(uniqueName, 0, arr, 0, count);
        return arr;
    }

    private static boolean isPresent(String[] arr, String ele) {
        for (String name : arr) {
            if (name != null && name.equals(ele)) {
                return true;
            }
        }
        return false;
    }
}
