package HW_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class Backup {

    public static void main(String[] args) {
        File initialDir = new File("D:/Обучение/geekBrains/java_core/jcore/src/main/java/HW_5/initial");
        backupDirectory(initialDir, "D:/Обучение/geekBrains/java_core/jcore/src/main/java/HW_5/backup");
    }

    public static void backupDirectory(File initialDir, String backupPath) {
        System.out.println("Проверка пути: " + initialDir.getAbsolutePath());
        if (!initialDir.exists() || !initialDir.isDirectory()) {
            System.out.println("Данный путь не является директорией или не существует.");
            return;
        }
        File backupDir = new File(backupPath);
        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        for (File file : initialDir.listFiles()) {
            if (file.isFile()) {
                copyFile(file, new File(backupDir, file.getName()));
            }
        }
    }

    public static void copyFile(File source, File dest) {
        try {
            if (!dest.exists()) {
                dest.createNewFile();
            }

            try (FileChannel initialChannel = new FileInputStream(source).getChannel();
                 FileChannel destChannel = new FileOutputStream(dest).getChannel()) {
                destChannel.transferFrom(initialChannel, 0, initialChannel.size());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}