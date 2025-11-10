public class Appointment {
    // 实例变量
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor; // 多态：接收任何HealthProfessional子类对象

    // 1. 默认构造
    public Appointment() {
        this.patientName = "";
        this.patientMobile = "";
        this.timeSlot = "";
        this.doctor = null;
    }

    // 2. 全参构造
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // 3. 打印预约详情
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Consulting Doctor: " + doctor.getName());
        System.out.println("Doctor ID: " + doctor.getId());
    }

    // Getter方法（cancelBooking需要通过手机号查找）
    public String getPatientMobile() {
        return patientMobile;
    }
}