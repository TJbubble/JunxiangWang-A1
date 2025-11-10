public class HealthProfessional {
    // 实例变量（ID用long避免超出int范围，纯数字）
    private long id;
    private String name;
    private String specialization; // 通用属性：所有健康从业者的共同领域（如“医疗服务”）

    // 1. 默认构造方法
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.specialization = "";
    }

    // 2. 全参构造方法（初始化所有属性）
    public HealthProfessional(long id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // 3. 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    // Getter方法（后续Appointment类需要访问医生信息，必须提供）
    public long getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
}