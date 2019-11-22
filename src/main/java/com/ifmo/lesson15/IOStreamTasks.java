package com.ifmo.lesson15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
    Реализуйте все методы с использованием потоков ввода-вывода.
 */
public class IOStreamTasks {
    public static void main(String[] args) throws IOException {
        File scr = new  File("C:\\ИТМО\\ifmo-lessons-master\\src\\main\\java\\com\\ifmo\\lesson15\\war");
        File dst = new File("C:\\ИТМО\\ifmo-lessons-master\\src\\main\\java\\com\\ifmo\\lesson15\\wap2.txt");

        try (InputStream in = new FileInputStream(scr);
             OutputStream out = new FileOutputStream(dst)){
            copy(in,out);
        }
    }

    /**
     * Полностью копирует один поток в другой.
     *
     * @param src Входящий поток.
     * @param dst Выходящий поток.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void copy(InputStream src, OutputStream dst) throws IOException {
        byte[] buf = new byte[1024];
        int len;
        while ((len=src.read(buf)) != -1) {
            dst.write(buf,0,len);
        }
        dst.flush();
    }

    /**
     * Последовательно разбивает файл на несколько более мелких, равных
     * указанному размеру. Последний файл может быть меньше задданого
     * размера.
     *
     * @param file Файл, который будет разбит на несколько.
     * @param dstDir Директория, в которой будут созданы файлы меньшего размера.
     * @param size Размер каждого файла-части, который будет создан.
     * @return Список файлов-частей в том порядке, в котором они должны считываться.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static List<File> split(File file, File dstDir, int size) throws IOException {
        List<File> list = new ArrayList<>();
        byte[] buf = new byte[size];
        try( InputStream scr = new FileInputStream(file)) {
            int len;
            for (int i = 1; ; i++) {
               if((len=scr.read(buf))<0) break;



            }
        }
        return list;
    }

    /**
     * Собирает из частей один файл.
     *
     * @param files Список файлов в порядке чтения.
     * @param dst Файл, в который будут записаны все части.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void assembly(List<File> files, File dst) throws IOException {

    }

    /**
     * Шифрует/дешифрует поток с помощью XOR. В качестве ключа используется пароль.
     *
     * @param src Входящий поток, данные которого будут зашифрованы/расшифрованы.
     * @param dst Выходящий поток, куда будут записаны зашифрованные/расшифрованные данные.
     * @param passphrase Пароль.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void encrypt(InputStream src, OutputStream dst, String passphrase) throws IOException {

    }

    /**
     * Шифрует/дешифрует файл с помощью файла-ключа.
     *
     * @param src Файл, который должен быть зашифрован/расшифрован.
     * @param dst Файл, куда будут записаны зашифрованные/расшифрованные данные.
     * @param key Файл-ключ.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void encrypt(File src, File dst, File key) throws IOException {

    }
}
