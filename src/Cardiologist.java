public class Cardiologist extends HealthProfessional {
    // 独特属性：专业领域（如“冠心病”“心律失常”）
    private String specialtyArea;

    // 1. 默认构造
    public Cardiologist() {
        super();
        this.specialtyArea = "";
    }

    // 2. 全参构造
    public Cardiologist(long id, String name, String specialization, String specialtyArea) {
        super(id, name, specialization);
        this.specialtyArea = specialtyArea;
    }

    // 3. 打印医生详情
    public void printProfessionalDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: Cardiologist");
        super.printDetails();
        System.out.println("Specialty Area: " + specialtyArea);
    }
}