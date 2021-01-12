package com.company;

import com.company.view.View;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InvalidFormatException {
	// write your code here
        View view = new View();
        view.init();

    }
}
