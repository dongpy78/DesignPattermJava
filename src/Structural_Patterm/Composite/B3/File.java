package Structural_Patterm.Composite.B3;

public class File implements IFolder {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getString() {
        return name;
    }

    @Override
    public String getPath() {
        return name;
    }
}
