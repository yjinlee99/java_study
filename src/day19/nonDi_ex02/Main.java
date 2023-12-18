package day19.nonDi_ex02;

public class Main {
    public static void main(String[] args) {
        NewRecordView view = new NewRecordView();
        NewRecord record = new NewRecord(10, 20, 30, 40);

        view.setRecord(record);
        view.print();
    }
}
