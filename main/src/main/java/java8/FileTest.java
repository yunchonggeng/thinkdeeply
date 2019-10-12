package java8;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * 方法和Lambda作为一等
 */
public class FileTest {
    public static void main(String[] args) {
        ishide();

    }


    private static void ishide(){
        System.out.println("一般写法");
        File[] files=new File(".").listFiles(new FileFilter(){
            @Override
            public boolean accept(File file){
                if(file.isHidden()){
                    System.out.println(file.getName());
                }
                return file.isHidden();
            }
        });

        System.out.println("lambda");
        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        Arrays.stream(hiddenFiles).forEach(file -> {
            System.out.println(file.getName());
        });
    }
}
