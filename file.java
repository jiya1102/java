class FileDownload {
    public static void download(String file) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(file + " " + "downloading....." + (i * 20) + "%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.err.println(file + "done");
    }

}

public class file {
    public static void main(String[] args) {

        FileDownload obj = new FileDownload();
        obj.download("A");
        obj.download("B");
    }
}
