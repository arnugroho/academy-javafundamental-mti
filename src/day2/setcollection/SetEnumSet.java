package day2.setcollection;

import java.util.EnumSet;

public class SetEnumSet {
	// an enum named Size
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    
    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

        System.out.println("EnumSet: " + sizes);
        
        // Creating an EnumSet using noneOf()
        EnumSet<Size> noneSizes = EnumSet.noneOf(Size.class);

        System.out.println("Empty EnumSet: " + noneSizes);
    }
}
