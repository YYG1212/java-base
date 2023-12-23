package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.initMember("user1", 15, 90);
        MemberInit memberInit2 = new MemberInit();
        memberInit2.initMember("user2", 15, 90);

//        initMember(memberInit1, "user1", 15, 90);
//        initMember(memberInit2, "user2", 16, 10);

        MemberInit[] members = {memberInit1, memberInit2};

        for (MemberInit member: members) {
            System.out.println( member.name + member.age + member.grade);
        }
    }
//    static void initMember(MemberInit member ,String name, int age, int grade ){
//        member.name = name;
//        member.age = age;
//        member.grade = grade;
//    }
}
