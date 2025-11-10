public class GeneralPractitioner extends HealthProfessional {
    // 独特属性：咨询时长（分钟）
    private int consultationDuration;

    // 1. 默认构造
    public GeneralPractitioner() {
        super(); // 调用父类默认构造
        this.consultationDuration = 0;
    }

    // 2. 全参构造（必须初始化父类所有属性+自身属性）
    public GeneralPractitioner(long id, String name, String specialization, int consultationDuration) {
        super(id, name, specialization); // 调用父类全参构造
        this.consultationDuration = consultationDuration;
    }

    // 3. 打印医生详情（包含类型+所有属性）
    public void printProfessionalDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: General Practitioner");
        super.printDetails(); // 调用父类打印方法
        System.out.println("Consultation Duration: " + consultationDuration + " minutes");
    }
}