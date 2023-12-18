package day19.nonDi_ex02;

public class NewRecordView {
    private NewRecord record;

   public void setRecord(NewRecord record) {
       this.record = record;
   }

    public void print() {
        System.out.println("KOR : " + record.getKor());
        System.out.println(record.total() + "  /  " + record.avg());
        System.out.println("------------------");
        System.out.println(record); //toString 호출
    }
}
