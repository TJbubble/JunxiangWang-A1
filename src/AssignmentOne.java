import java.util.ArrayList; // 必须导入ArrayList，否则会报错

public class AssignmentOne {
    // 声明ArrayList存储预约（Part5用，静态变量：属于类，main方法能直接用）
    private static ArrayList<Appointment> appointmentList = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects（作业要求的注释，必须有）
        System.out.println("=== Part 3: Health Professional Details ===");
        // 3个GeneralPractitioner对象（ID、姓名、专业领域、咨询时长）
        GeneralPractitioner gp1 = new GeneralPractitioner(1001, "Dr. Smith", "Primary Care", 15);
        GeneralPractitioner gp2 = new GeneralPractitioner(1002, "Dr. Jones", "Primary Care", 20);
        GeneralPractitioner gp3 = new GeneralPractitioner(1003, "Dr. Brown", "Primary Care", 15);

        // 2个Cardiologist对象（ID、姓名、专业领域、细分领域）
        Cardiologist cardio1 = new Cardiologist(2001, "Dr. Lee", "Cardiology", "Coronary Heart Disease");
        Cardiologist cardio2 = new Cardiologist(2002, "Dr. Wang", "Cardiology", "Arrhythmia");

        // 调用打印方法，输出所有医生详情
        gp1.printProfessionalDetails();
        System.out.println("---"); // 分割线，方便查看
        gp2.printProfessionalDetails();
        System.out.println("---");
        gp3.printProfessionalDetails();
        System.out.println("---");
        cardio1.printProfessionalDetails();
        System.out.println("---");
        cardio2.printProfessionalDetails();

        // 作业要求的分割线，必须有
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments（作业要求的注释，必须有）
        System.out.println("=== Part 5: Appointment Management ===");
        // 演示创建4个预约（2个GP，2个Cardiologist）
        createAppointment("Alice", "0412345678", "08:00", gp1);
        createAppointment("Bob", "0487654321", "10:30", gp2);
        createAppointment("Charlie", "0456789012", "14:00", cardio1);
        createAppointment("Diana", "0423456789", "16:30", cardio2);

        // 打印所有预约
        System.out.println("\nAfter adding appointments:");
        printExistingAppointments();

        // 取消Alice的预约（手机号0412345678）
        System.out.println("\nCanceling Alice's appointment...");
        cancelBooking("0412345678");

        // 再次打印预约，展示取消后的效果
        System.out.println("\nAfter canceling:");
        printExistingAppointments();

        // 作业要求的分割线，必须有
        System.out.println("------------------------------");
    }

    // Part5方法1：创建预约（添加到ArrayList）
    private static void createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        // 验证信息完整性（缺一不可，否则不创建预约）
        if (patientName.isEmpty() || patientMobile.isEmpty() || timeSlot.isEmpty() || doctor == null) {
            System.out.println("Error: All appointment details (name, mobile, time slot, doctor) must be provided. Appointment not created.");
            return;
        }
        // 创建预约对象并添加到集合
        Appointment newAppointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
        appointmentList.add(newAppointment);
        System.out.println("Appointment created successfully for " + patientName);
    }

    // Part5方法2：打印所有预约
    private static void printExistingAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        System.out.println("Existing Appointments (" + appointmentList.size() + "):");
        for (int i = 0; i < appointmentList.size(); i++) {
            System.out.println("\nAppointment " + (i + 1) + ":");
            appointmentList.get(i).printAppointmentDetails();
        }
    }

    // Part5方法3：通过手机号取消预约
    private static void cancelBooking(String patientMobile) {
        boolean found = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            Appointment appt = appointmentList.get(i);
            if (appt.getPatientMobile().equals(patientMobile)) {
                appointmentList.remove(i);
                found = true;
                System.out.println("Appointment for mobile " + patientMobile + " canceled successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found with mobile " + patientMobile + ".");
        }
    }
}