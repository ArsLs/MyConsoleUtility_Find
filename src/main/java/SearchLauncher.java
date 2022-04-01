import org.kohsuke.args4j.*;

public class SearchLauncher {

    @Option(name="-r",usage="Also search in subdirectories")
    private boolean recursive;

    @Option(name="-d", required = true, usage="Directory to search in",metaVar="Directory")
    private String dir = "";

    @Argument(required = true, metaVar = "dirName", usage = "Directory name")
    private String fileName;

    public static void main(String[] args) {
        System.out.println("Hello");
    }


}
