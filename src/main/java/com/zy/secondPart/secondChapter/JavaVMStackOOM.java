package com.zy.secondPart.secondChapter;

import java.util.HashSet;
import java.util.Set;

/**
 * 基于jdk 1.6
 * 在调用”ab”.intern()方法的时候会返回”ab”，但是这个方法会首先检查字符串池中是否有”ab”这个字符串，
 * 如果存在则返回这个字符串的引用，否则就将这个字符串添加到字符串池中，然会返回这个字符串的引用。
 */
public class JavaVMStackOOM {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        short i =0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
