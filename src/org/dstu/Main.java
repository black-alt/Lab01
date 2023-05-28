package org.dstu;

import org.dstu.domain.IFurniture;
import org.dstu.domain.Bed;
import org.dstu.domain.Sofa;
import org.dstu.util.CsvReader;
import org.dstu.util.SerializeUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify data file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        List<String[]> strings = CsvReader.readCsvFile(sourceFile, ";");
        List<IFurniture> furniture = new ArrayList<>();
        for (String[] line: strings) {
            if (line[0].equals("0")) {
                furniture.add(new Bed(line));
            } else {
                furniture.add(new Sofa(line));
            }
        }

        furniture.forEach(System.out::println);

        SerializeUtils.serialize(furniture, binFile);
        List<IFurniture> newFurniture = (List<IFurniture>) SerializeUtils.deserialize(binFile);
        System.out.println("New furniture:");
        newFurniture.forEach(System.out::println);
    }
}
