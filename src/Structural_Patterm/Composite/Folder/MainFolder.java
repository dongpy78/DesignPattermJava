package Structural_Patterm.Composite.Folder;

import java.util.List;
import java.util.ArrayList;

public class MainFolder {
    public static void main(String[] args) {
        // Create files
        AbstractFile creationalPattern = new File("CreationalPattern.pptx", "2024-03-14");
        AbstractFile structuralPattern = new File("StructuralPattern.pptx", "2024-03-14");
        AbstractFile javaBasic = new File("LapTrinhJavaCoBan.docx", "2024-03-14");
        AbstractFile javaAdvanced = new File("LapTrinhJavaNangCao.pdf", "2024-03-14");
        AbstractFile cProgramming = new File("NgonNguLapTrinhC.pdf", "2024-03-14");
        AbstractFile mobileBasic = new File("CoBan.pptx", "2024-03-14");
        AbstractFile mobileAdvanced = new File("NangCao.pptx", "2024-03-14");

        // Create folders
//        AbstractFile designPatternFolder = new Folder("Design Pattern", "2024-03-14", List.of(creationalPattern, structuralPattern));
//        AbstractFile javaFolder = new Folder("Lap Trinh Java", "2024-03-14", List.of(javaBasic, javaAdvanced, cProgramming));
//        AbstractFile mobileFolder = new Folder("LapTrinhThietBiDiDong", "2024-03-14", List.of(mobileBasic, mobileAdvanced));
//        AbstractFile documentsFolder = new Folder("TaiLieu", "2024-03-14", List.of(designPatternFolder, javaFolder, cProgramming, mobileFolder));
//        AbstractFile rootFolder = new Folder("Data (D:)", "2024-03-14", List.of(documentsFolder));

//        designPatternFolder.add(javaFolder);

    AbstractFile rootFolder = new Folder("D", "12-12-212");
    rootFolder.add(cProgramming);

        // Display the folder structure
        System.out.println(rootFolder.getStringTreeFolder(""));

    }

}
