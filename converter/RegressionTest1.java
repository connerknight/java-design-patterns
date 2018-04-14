import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str14 = user4.getLastName();
        com.iluwatar.converter.User user19 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean21 = user19.equals((java.lang.Object) 1.0d);
        boolean boolean23 = user19.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user28 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean30 = user28.equals((java.lang.Object) 10L);
        boolean boolean31 = user19.equals((java.lang.Object) user28);
        java.lang.String str32 = user28.getUserId();
        boolean boolean34 = user28.equals((java.lang.Object) true);
        boolean boolean35 = user4.equals((java.lang.Object) user28);
        java.lang.String str36 = user28.getUserId();
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean43 = user41.equals((java.lang.Object) 1.0d);
        boolean boolean44 = user41.isActive();
        java.lang.Class<?> wildcardClass45 = user41.getClass();
        boolean boolean46 = user41.isActive();
        boolean boolean47 = user41.isActive();
        java.lang.String str48 = user41.getUserId();
        boolean boolean50 = user41.equals((java.lang.Object) 100.0d);
        java.lang.String str51 = user41.getLastName();
        com.iluwatar.converter.User user56 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean58 = user56.equals((java.lang.Object) 1.0d);
        boolean boolean60 = user56.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user65 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean67 = user65.equals((java.lang.Object) 10L);
        boolean boolean68 = user56.equals((java.lang.Object) user65);
        java.lang.String str69 = user65.getUserId();
        boolean boolean71 = user65.equals((java.lang.Object) true);
        boolean boolean72 = user41.equals((java.lang.Object) user65);
        java.lang.Class<?> wildcardClass73 = user41.getClass();
        java.lang.Class<?> wildcardClass74 = user41.getClass();
        java.lang.String str75 = user41.getFirstName();
        boolean boolean76 = user28.equals((java.lang.Object) user41);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!" + "'", str69.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        java.lang.String str24 = user21.toString();
        boolean boolean25 = user4.equals((java.lang.Object) user21);
        java.lang.String str26 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str24.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.toString();
        boolean boolean18 = user4.isActive();
        java.lang.String str19 = user4.getFirstName();
        boolean boolean20 = user4.isActive();
        java.lang.Class<?> wildcardClass21 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        boolean boolean17 = user4.isActive();
        java.lang.String str18 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.toString();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}" + "'", str7.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean12 = user10.equals((java.lang.Object) 1.0d);
        boolean boolean13 = user10.isActive();
        java.lang.Class<?> wildcardClass14 = user10.getClass();
        boolean boolean15 = user10.isActive();
        boolean boolean16 = user10.isActive();
        boolean boolean17 = user10.isActive();
        boolean boolean18 = user10.isActive();
        java.lang.String str19 = user10.getFirstName();
        java.lang.Object obj20 = null;
        boolean boolean21 = user10.equals(obj20);
        java.lang.String str22 = user10.getLastName();
        com.iluwatar.converter.User user27 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean29 = user27.equals((java.lang.Object) 1.0d);
        java.lang.String str30 = user27.toString();
        boolean boolean31 = user10.equals((java.lang.Object) user27);
        java.lang.String str32 = user27.getLastName();
        java.lang.String str33 = user27.getLastName();
        boolean boolean34 = user4.equals((java.lang.Object) user27);
        java.lang.Class<?> wildcardClass35 = user27.getClass();
        java.lang.String str36 = user27.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str30.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str36.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        boolean boolean10 = user4.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.Class<?> wildcardClass10 = user4.getClass();
        java.lang.String str11 = user4.getUserId();
        java.lang.String str12 = user4.toString();
        com.iluwatar.converter.User user17 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user22 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean24 = user22.equals((java.lang.Object) 1.0d);
        boolean boolean25 = user22.isActive();
        java.lang.Class<?> wildcardClass26 = user22.getClass();
        java.lang.String str27 = user22.getUserId();
        boolean boolean28 = user22.isActive();
        boolean boolean29 = user17.equals((java.lang.Object) user22);
        java.lang.String str30 = user17.getLastName();
        java.lang.Class<?> wildcardClass31 = user17.getClass();
        java.lang.Class<?> wildcardClass32 = user17.getClass();
        com.iluwatar.converter.User user37 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean39 = user37.equals((java.lang.Object) 1.0d);
        boolean boolean41 = user37.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user46 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean48 = user46.equals((java.lang.Object) 10L);
        boolean boolean49 = user37.equals((java.lang.Object) user46);
        boolean boolean50 = user37.isActive();
        boolean boolean51 = user17.equals((java.lang.Object) boolean50);
        boolean boolean52 = user4.equals((java.lang.Object) boolean50);
        java.lang.String str53 = user4.toString();
        com.iluwatar.converter.User user58 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user63 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean65 = user63.equals((java.lang.Object) 1.0d);
        boolean boolean66 = user63.isActive();
        java.lang.Class<?> wildcardClass67 = user63.getClass();
        java.lang.String str68 = user63.getUserId();
        boolean boolean69 = user63.isActive();
        boolean boolean70 = user58.equals((java.lang.Object) user63);
        boolean boolean72 = user63.equals((java.lang.Object) 1L);
        java.lang.String str73 = user63.getUserId();
        java.lang.Class<?> wildcardClass74 = user63.getClass();
        boolean boolean75 = user63.isActive();
        java.lang.String str76 = user63.toString();
        boolean boolean77 = user4.equals((java.lang.Object) str76);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str12.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str53.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!" + "'", str73.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str76.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=false, userId='User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", false, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId=''}");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        boolean boolean24 = user21.isActive();
        java.lang.Class<?> wildcardClass25 = user21.getClass();
        java.lang.String str26 = user21.getUserId();
        boolean boolean27 = user4.equals((java.lang.Object) user21);
        java.lang.String str28 = user21.getLastName();
        java.lang.Class<?> wildcardClass29 = user21.getClass();
        java.lang.String str30 = user21.getLastName();
        java.lang.Class<?> wildcardClass31 = user21.getClass();
        java.lang.String str32 = user21.toString();
        java.lang.String str33 = user21.getUserId();
        boolean boolean34 = user21.isActive();
        boolean boolean35 = user21.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str32.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean12 = user10.equals((java.lang.Object) 1.0d);
        boolean boolean14 = user10.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user19 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean21 = user19.equals((java.lang.Object) 10L);
        boolean boolean22 = user10.equals((java.lang.Object) user19);
        boolean boolean23 = user10.isActive();
        java.lang.String str24 = user10.getUserId();
        java.lang.String str25 = user10.toString();
        boolean boolean26 = user4.equals((java.lang.Object) str25);
        java.lang.String str27 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str25.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        boolean boolean18 = user9.equals((java.lang.Object) 1L);
        java.lang.String str19 = user9.getUserId();
        java.lang.Class<?> wildcardClass20 = user9.getClass();
        java.lang.String str21 = user9.getFirstName();
        java.lang.String str22 = user9.getLastName();
        java.lang.String str23 = user9.getFirstName();
        java.lang.String str24 = user9.getLastName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getUserId();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user14 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean16 = user14.equals((java.lang.Object) 1.0d);
        boolean boolean17 = user14.isActive();
        java.lang.Class<?> wildcardClass18 = user14.getClass();
        java.lang.String str19 = user14.getUserId();
        boolean boolean20 = user14.isActive();
        boolean boolean21 = user9.equals((java.lang.Object) user14);
        java.lang.String str22 = user9.getFirstName();
        java.lang.String str23 = user9.getFirstName();
        com.iluwatar.converter.User user28 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean30 = user28.equals((java.lang.Object) 1.0d);
        boolean boolean31 = user28.isActive();
        java.lang.Class<?> wildcardClass32 = user28.getClass();
        boolean boolean33 = user28.isActive();
        boolean boolean34 = user28.isActive();
        boolean boolean35 = user28.isActive();
        boolean boolean36 = user28.isActive();
        java.lang.String str37 = user28.getFirstName();
        boolean boolean38 = user9.equals((java.lang.Object) user28);
        boolean boolean39 = user4.equals((java.lang.Object) user28);
        com.iluwatar.converter.User user44 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean46 = user44.equals((java.lang.Object) 1.0d);
        boolean boolean47 = user44.isActive();
        java.lang.Class<?> wildcardClass48 = user44.getClass();
        boolean boolean49 = user44.isActive();
        boolean boolean50 = user44.isActive();
        boolean boolean51 = user44.isActive();
        boolean boolean52 = user44.isActive();
        java.lang.String str53 = user44.getFirstName();
        java.lang.Object obj54 = null;
        boolean boolean55 = user44.equals(obj54);
        java.lang.String str56 = user44.getLastName();
        com.iluwatar.converter.User user61 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean63 = user61.equals((java.lang.Object) 1.0d);
        java.lang.String str64 = user61.toString();
        boolean boolean65 = user44.equals((java.lang.Object) user61);
        java.lang.String str66 = user61.getLastName();
        java.lang.String str67 = user61.getFirstName();
        boolean boolean68 = user4.equals((java.lang.Object) str67);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str64.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        java.lang.String str12 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.toString();
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.toString();
        com.iluwatar.converter.User user15 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str16 = user15.getUserId();
        boolean boolean17 = user4.equals((java.lang.Object) user15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str16.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getLastName();
        java.lang.Class<?> wildcardClass12 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.getFirstName();
        java.lang.String str14 = user4.getUserId();
        java.lang.String str15 = user4.toString();
        com.iluwatar.converter.User user20 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean22 = user20.equals((java.lang.Object) 1.0d);
        boolean boolean23 = user20.isActive();
        java.lang.Class<?> wildcardClass24 = user20.getClass();
        boolean boolean25 = user20.isActive();
        boolean boolean26 = user20.isActive();
        java.lang.String str27 = user20.getUserId();
        java.lang.Class<?> wildcardClass28 = user20.getClass();
        com.iluwatar.converter.User user33 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean35 = user33.equals((java.lang.Object) 1.0d);
        boolean boolean36 = user33.isActive();
        java.lang.Class<?> wildcardClass37 = user33.getClass();
        boolean boolean38 = user33.isActive();
        boolean boolean39 = user33.isActive();
        boolean boolean40 = user33.isActive();
        boolean boolean41 = user33.isActive();
        java.lang.String str42 = user33.getFirstName();
        java.lang.Object obj43 = null;
        boolean boolean44 = user33.equals(obj43);
        java.lang.String str45 = user33.getLastName();
        com.iluwatar.converter.User user50 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean52 = user50.equals((java.lang.Object) 1.0d);
        java.lang.String str53 = user50.toString();
        boolean boolean54 = user33.equals((java.lang.Object) user50);
        java.lang.String str55 = user50.getLastName();
        java.lang.String str56 = user50.getFirstName();
        java.lang.Class<?> wildcardClass57 = user50.getClass();
        boolean boolean58 = user50.isActive();
        boolean boolean59 = user20.equals((java.lang.Object) boolean58);
        boolean boolean60 = user4.equals((java.lang.Object) user20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str15.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str53.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getUserId();
        boolean boolean7 = user4.isActive();
        boolean boolean8 = user4.isActive();
        java.lang.String str9 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        boolean boolean12 = user4.equals((java.lang.Object) 1.0f);
        java.lang.String str13 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        boolean boolean24 = user21.isActive();
        java.lang.Class<?> wildcardClass25 = user21.getClass();
        java.lang.String str26 = user21.getUserId();
        boolean boolean27 = user4.equals((java.lang.Object) user21);
        java.lang.String str28 = user21.getLastName();
        java.lang.String str29 = user21.toString();
        java.lang.String str30 = user21.getUserId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str29.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        boolean boolean24 = user21.isActive();
        java.lang.Class<?> wildcardClass25 = user21.getClass();
        java.lang.String str26 = user21.getUserId();
        boolean boolean27 = user4.equals((java.lang.Object) user21);
        java.lang.Class<?> wildcardClass28 = user4.getClass();
        java.lang.String str29 = user4.toString();
        com.iluwatar.converter.User user34 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user39 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean41 = user39.equals((java.lang.Object) 1.0d);
        boolean boolean42 = user39.isActive();
        java.lang.Class<?> wildcardClass43 = user39.getClass();
        java.lang.String str44 = user39.getUserId();
        boolean boolean45 = user39.isActive();
        boolean boolean46 = user34.equals((java.lang.Object) user39);
        java.lang.String str47 = user34.getFirstName();
        java.lang.String str48 = user34.getFirstName();
        java.lang.String str49 = user34.toString();
        com.iluwatar.converter.User user54 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}");
        boolean boolean55 = user34.equals((java.lang.Object) "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}");
        boolean boolean56 = user4.equals((java.lang.Object) user34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str29.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str49.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        boolean boolean5 = user4.isActive();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        java.lang.String str7 = user4.getUserId();
        boolean boolean8 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        com.iluwatar.converter.User user11 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str12 = user11.getLastName();
        java.lang.String str13 = user11.getLastName();
        java.lang.String str14 = user11.getUserId();
        boolean boolean15 = user4.equals((java.lang.Object) str14);
        boolean boolean17 = user4.equals((java.lang.Object) (short) 10);
        com.iluwatar.converter.User user22 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean23 = user4.equals((java.lang.Object) true);
        java.lang.String str24 = user4.getFirstName();
        com.iluwatar.converter.User user29 = new com.iluwatar.converter.User("User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", false, "");
        boolean boolean30 = user4.equals((java.lang.Object) "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}");
        java.lang.String str31 = user4.getUserId();
        boolean boolean32 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str24.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", true, "");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        boolean boolean10 = user4.equals((java.lang.Object) true);
        com.iluwatar.converter.User user15 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean17 = user15.equals((java.lang.Object) 1.0d);
        boolean boolean18 = user15.isActive();
        java.lang.Class<?> wildcardClass19 = user15.getClass();
        boolean boolean20 = user15.isActive();
        boolean boolean21 = user15.isActive();
        java.lang.String str22 = user15.getUserId();
        boolean boolean24 = user15.equals((java.lang.Object) 100.0d);
        java.lang.String str25 = user15.getLastName();
        com.iluwatar.converter.User user30 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean32 = user30.equals((java.lang.Object) 1.0d);
        boolean boolean34 = user30.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user39 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean41 = user39.equals((java.lang.Object) 10L);
        boolean boolean42 = user30.equals((java.lang.Object) user39);
        java.lang.String str43 = user39.getUserId();
        boolean boolean45 = user39.equals((java.lang.Object) true);
        boolean boolean46 = user15.equals((java.lang.Object) user39);
        boolean boolean47 = user4.equals((java.lang.Object) boolean46);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.getUserId();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        boolean boolean12 = user4.isActive();
        com.iluwatar.converter.User user17 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean19 = user17.equals((java.lang.Object) 1.0d);
        boolean boolean20 = user17.isActive();
        java.lang.Class<?> wildcardClass21 = user17.getClass();
        boolean boolean22 = user17.isActive();
        boolean boolean23 = user17.isActive();
        java.lang.String str24 = user17.getUserId();
        java.lang.Class<?> wildcardClass25 = user17.getClass();
        java.lang.String str26 = user17.getUserId();
        boolean boolean27 = user4.equals((java.lang.Object) user17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        boolean boolean5 = user4.isActive();
        java.lang.Object obj6 = null;
        boolean boolean7 = user4.equals(obj6);
        com.iluwatar.converter.User user12 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user17 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean19 = user17.equals((java.lang.Object) 1.0d);
        boolean boolean20 = user17.isActive();
        java.lang.Class<?> wildcardClass21 = user17.getClass();
        java.lang.String str22 = user17.getUserId();
        boolean boolean23 = user17.isActive();
        boolean boolean24 = user12.equals((java.lang.Object) user17);
        java.lang.String str25 = user12.getFirstName();
        java.lang.Object obj26 = new java.lang.Object();
        boolean boolean27 = user12.equals(obj26);
        boolean boolean28 = user4.equals((java.lang.Object) user12);
        java.lang.String str29 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str29.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        java.lang.String str17 = user13.getUserId();
        java.lang.String str18 = user13.getUserId();
        boolean boolean20 = user13.equals((java.lang.Object) 1);
        java.lang.String str21 = user13.getLastName();
        java.lang.String str22 = user13.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str22.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        boolean boolean11 = user4.isActive();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.getFirstName();
        java.lang.Object obj14 = null;
        boolean boolean15 = user4.equals(obj14);
        java.lang.String str16 = user4.getLastName();
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        java.lang.String str24 = user21.toString();
        boolean boolean25 = user4.equals((java.lang.Object) user21);
        boolean boolean26 = user4.isActive();
        java.lang.String str27 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str24.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getLastName();
        java.lang.Object obj8 = null;
        boolean boolean9 = user4.equals(obj8);
        java.lang.String str10 = user4.getFirstName();
        java.lang.String str11 = user4.getFirstName();
        java.lang.String str12 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str11.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str12.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.toString();
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.getLastName();
        java.lang.String str10 = user4.getFirstName();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str9 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str14 = user4.getFirstName();
        java.lang.String str15 = user4.getFirstName();
        java.lang.Object obj16 = null;
        boolean boolean17 = user4.equals(obj16);
        boolean boolean18 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.toString();
        java.lang.String str7 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='hi!', lastName='', isActive=true, userId=''}" + "'", str5.equals("User{firstName='hi!', lastName='', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='hi!', lastName='', isActive=true, userId=''}" + "'", str6.equals("User{firstName='hi!', lastName='', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId=''}");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='hi!', lastName='', isActive=true, userId=''}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        boolean boolean24 = user21.isActive();
        java.lang.Class<?> wildcardClass25 = user21.getClass();
        java.lang.String str26 = user21.getUserId();
        boolean boolean27 = user4.equals((java.lang.Object) user21);
        java.lang.String str28 = user4.getFirstName();
        java.lang.String str29 = user4.getUserId();
        java.lang.String str30 = user4.toString();
        java.lang.Class<?> wildcardClass31 = user4.getClass();
        java.lang.String str32 = user4.getFirstName();
        java.lang.String str33 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str30.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str33.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getLastName();
        boolean boolean7 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        boolean boolean18 = user9.equals((java.lang.Object) 1L);
        java.lang.String str19 = user9.getUserId();
        java.lang.Class<?> wildcardClass20 = user9.getClass();
        java.lang.String str21 = user9.getFirstName();
        java.lang.Class<?> wildcardClass22 = user9.getClass();
        java.lang.String str23 = user9.toString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str23.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId=''}");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId=''}", "User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='hi!', lastName='', isActive=true, userId=''}'}");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='hi!', lastName='', isActive=true, userId=''}");
        java.lang.String str5 = user4.toString();
        boolean boolean6 = user4.isActive();
        boolean boolean7 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='hi!', lastName='', isActive=true, userId=''}'}" + "'", str5.equals("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='hi!', lastName='', isActive=true, userId=''}'}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        java.lang.String str14 = user10.getLastName();
        java.lang.String str15 = user10.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.toString();
        java.lang.String str15 = user9.toString();
        boolean boolean16 = user4.equals((java.lang.Object) str15);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        boolean boolean24 = user21.isActive();
        java.lang.Class<?> wildcardClass25 = user21.getClass();
        java.lang.String str26 = user21.toString();
        boolean boolean27 = user4.equals((java.lang.Object) user21);
        com.iluwatar.converter.User user32 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str33 = user32.getLastName();
        boolean boolean34 = user21.equals((java.lang.Object) user32);
        java.lang.String str35 = user21.getUserId();
        java.lang.String str36 = user21.getUserId();
        java.lang.Class<?> wildcardClass37 = user21.getClass();
        java.lang.String str38 = user21.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str15.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str26.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.Class<?> wildcardClass9 = user4.getClass();
        boolean boolean10 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.toString();
        java.lang.String str15 = user9.toString();
        boolean boolean16 = user4.equals((java.lang.Object) str15);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        boolean boolean24 = user21.isActive();
        java.lang.Class<?> wildcardClass25 = user21.getClass();
        java.lang.String str26 = user21.toString();
        boolean boolean27 = user4.equals((java.lang.Object) user21);
        com.iluwatar.converter.User user32 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str33 = user32.getLastName();
        boolean boolean34 = user21.equals((java.lang.Object) user32);
        boolean boolean35 = user32.isActive();
        java.lang.Class<?> wildcardClass36 = user32.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str15.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str26.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.toString();
        java.lang.String str15 = user9.toString();
        boolean boolean16 = user4.equals((java.lang.Object) str15);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        boolean boolean24 = user21.isActive();
        java.lang.Class<?> wildcardClass25 = user21.getClass();
        java.lang.String str26 = user21.toString();
        boolean boolean27 = user4.equals((java.lang.Object) user21);
        com.iluwatar.converter.User user32 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str33 = user32.getLastName();
        boolean boolean34 = user21.equals((java.lang.Object) user32);
        java.lang.Class<?> wildcardClass35 = user21.getClass();
        java.lang.Class<?> wildcardClass36 = user21.getClass();
        boolean boolean37 = user21.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str15.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str26.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getLastName();
        java.lang.String str8 = user4.getUserId();
        java.lang.String str9 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str9.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", true, "hi!");
        java.lang.String str5 = user4.toString();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.Class<?> wildcardClass11 = user10.getClass();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        com.iluwatar.converter.User user17 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str18 = user17.getUserId();
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user28 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean30 = user28.equals((java.lang.Object) 1.0d);
        boolean boolean31 = user28.isActive();
        java.lang.Class<?> wildcardClass32 = user28.getClass();
        java.lang.String str33 = user28.getUserId();
        boolean boolean34 = user28.isActive();
        boolean boolean35 = user23.equals((java.lang.Object) user28);
        com.iluwatar.converter.User user40 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean42 = user40.equals((java.lang.Object) 1.0d);
        boolean boolean43 = user40.isActive();
        java.lang.Class<?> wildcardClass44 = user40.getClass();
        java.lang.String str45 = user40.getUserId();
        boolean boolean46 = user23.equals((java.lang.Object) user40);
        java.lang.String str47 = user40.getLastName();
        java.lang.Class<?> wildcardClass48 = user40.getClass();
        boolean boolean49 = user17.equals((java.lang.Object) wildcardClass48);
        com.iluwatar.converter.User user54 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean56 = user54.equals((java.lang.Object) 1.0d);
        boolean boolean57 = user54.isActive();
        java.lang.Class<?> wildcardClass58 = user54.getClass();
        boolean boolean59 = user54.isActive();
        boolean boolean60 = user54.isActive();
        boolean boolean61 = user54.isActive();
        boolean boolean62 = user54.isActive();
        java.lang.String str63 = user54.getFirstName();
        java.lang.Object obj64 = null;
        boolean boolean65 = user54.equals(obj64);
        boolean boolean66 = user17.equals((java.lang.Object) user54);
        boolean boolean67 = user54.isActive();
        com.iluwatar.converter.User user72 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        com.iluwatar.converter.User user77 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean79 = user77.equals((java.lang.Object) 1.0d);
        boolean boolean80 = user77.isActive();
        java.lang.Class<?> wildcardClass81 = user77.getClass();
        java.lang.String str82 = user77.toString();
        java.lang.String str83 = user77.toString();
        boolean boolean84 = user72.equals((java.lang.Object) str83);
        java.lang.String str85 = user72.toString();
        java.lang.String str86 = user72.toString();
        boolean boolean87 = user54.equals((java.lang.Object) str86);
        boolean boolean88 = user4.equals((java.lang.Object) str86);
        java.lang.String str89 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str18.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str82.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str83.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}" + "'", str85.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}" + "'", str86.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str89.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "", true, "User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}'}");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.toString();
        com.iluwatar.converter.User user14 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean16 = user14.equals((java.lang.Object) 1.0d);
        java.lang.String str17 = user14.getUserId();
        java.lang.Class<?> wildcardClass18 = user14.getClass();
        boolean boolean19 = user4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.getUserId();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str13.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean12 = user10.equals((java.lang.Object) 1.0d);
        boolean boolean13 = user10.isActive();
        java.lang.Class<?> wildcardClass14 = user10.getClass();
        boolean boolean15 = user10.isActive();
        boolean boolean16 = user10.isActive();
        boolean boolean17 = user10.isActive();
        boolean boolean18 = user10.isActive();
        java.lang.String str19 = user10.getFirstName();
        java.lang.Object obj20 = null;
        boolean boolean21 = user10.equals(obj20);
        java.lang.String str22 = user10.getLastName();
        com.iluwatar.converter.User user27 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean29 = user27.equals((java.lang.Object) 1.0d);
        java.lang.String str30 = user27.toString();
        boolean boolean31 = user10.equals((java.lang.Object) user27);
        java.lang.String str32 = user27.getLastName();
        java.lang.String str33 = user27.getLastName();
        boolean boolean34 = user4.equals((java.lang.Object) user27);
        boolean boolean35 = user27.isActive();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str30.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        java.lang.String str14 = user10.getLastName();
        java.lang.String str15 = user10.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = user10.equals(obj16);
        java.lang.String str18 = user10.getLastName();
        java.lang.String str19 = user10.getLastName();
        java.lang.String str20 = user10.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str15.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str20.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        java.lang.String str5 = user4.getUserId();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user15 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean17 = user15.equals((java.lang.Object) 1.0d);
        boolean boolean18 = user15.isActive();
        java.lang.Class<?> wildcardClass19 = user15.getClass();
        java.lang.String str20 = user15.getUserId();
        boolean boolean21 = user15.isActive();
        boolean boolean22 = user10.equals((java.lang.Object) user15);
        com.iluwatar.converter.User user27 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean29 = user27.equals((java.lang.Object) 1.0d);
        boolean boolean30 = user27.isActive();
        java.lang.Class<?> wildcardClass31 = user27.getClass();
        java.lang.String str32 = user27.getUserId();
        boolean boolean33 = user10.equals((java.lang.Object) user27);
        java.lang.String str34 = user27.getLastName();
        java.lang.String str35 = user27.toString();
        boolean boolean36 = user4.equals((java.lang.Object) user27);
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean42 = user41.isActive();
        boolean boolean43 = user4.equals((java.lang.Object) user41);
        java.lang.String str44 = user41.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str35.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        boolean boolean15 = user10.equals((java.lang.Object) "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str16 = user10.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.Class<?> wildcardClass10 = user9.getClass();
        boolean boolean11 = user4.equals((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.String str11 = user4.getUserId();
        java.lang.String str12 = user4.getFirstName();
        boolean boolean13 = user4.isActive();
        boolean boolean14 = user4.isActive();
        boolean boolean15 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        java.lang.String str7 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str7.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        boolean boolean11 = user4.isActive();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.getFirstName();
        java.lang.Object obj14 = null;
        boolean boolean15 = user4.equals(obj14);
        boolean boolean16 = user4.isActive();
        boolean boolean17 = user4.isActive();
        boolean boolean19 = user4.equals((java.lang.Object) 10.0f);
        java.lang.String str20 = user4.getUserId();
        java.lang.String str21 = user4.getUserId();
        java.lang.Class<?> wildcardClass22 = user4.getClass();
        java.lang.String str23 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getLastName();
        java.lang.String str8 = user4.getFirstName();
        java.lang.String str9 = user4.toString();
        com.iluwatar.converter.User user14 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean16 = user14.equals((java.lang.Object) 1.0d);
        boolean boolean17 = user14.isActive();
        java.lang.Class<?> wildcardClass18 = user14.getClass();
        boolean boolean19 = user14.isActive();
        boolean boolean20 = user14.isActive();
        java.lang.String str21 = user14.getUserId();
        boolean boolean23 = user14.equals((java.lang.Object) 100.0d);
        java.lang.String str24 = user14.getLastName();
        com.iluwatar.converter.User user29 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean31 = user29.equals((java.lang.Object) 1.0d);
        boolean boolean33 = user29.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user38 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean40 = user38.equals((java.lang.Object) 10L);
        boolean boolean41 = user29.equals((java.lang.Object) user38);
        java.lang.String str42 = user38.getUserId();
        boolean boolean44 = user38.equals((java.lang.Object) true);
        boolean boolean45 = user14.equals((java.lang.Object) user38);
        java.lang.String str46 = user38.getUserId();
        java.lang.Class<?> wildcardClass47 = user38.getClass();
        boolean boolean48 = user4.equals((java.lang.Object) wildcardClass47);
        java.lang.Class<?> wildcardClass49 = user4.getClass();
        java.lang.String str50 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str9.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str50.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        boolean boolean24 = user21.isActive();
        java.lang.Class<?> wildcardClass25 = user21.getClass();
        java.lang.String str26 = user21.getUserId();
        boolean boolean27 = user4.equals((java.lang.Object) user21);
        java.lang.String str28 = user21.getLastName();
        java.lang.String str29 = user21.getFirstName();
        boolean boolean30 = user21.isActive();
        java.lang.String str31 = user21.getUserId();
        com.iluwatar.converter.User user36 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean38 = user36.equals((java.lang.Object) 1.0d);
        boolean boolean39 = user36.isActive();
        java.lang.Class<?> wildcardClass40 = user36.getClass();
        java.lang.String str41 = user36.toString();
        java.lang.String str42 = user36.toString();
        java.lang.String str43 = user36.getUserId();
        com.iluwatar.converter.User user48 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str49 = user48.getLastName();
        com.iluwatar.converter.User user54 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str55 = user54.getLastName();
        boolean boolean56 = user48.equals((java.lang.Object) user54);
        java.lang.String str57 = user54.toString();
        java.lang.String str58 = user54.getLastName();
        java.lang.Class<?> wildcardClass59 = user54.getClass();
        java.lang.String str60 = user54.getUserId();
        boolean boolean61 = user54.isActive();
        java.lang.String str62 = user54.toString();
        boolean boolean63 = user36.equals((java.lang.Object) str62);
        boolean boolean64 = user21.equals((java.lang.Object) user36);
        java.lang.String str65 = user21.getUserId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str41.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str42.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str57.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str60.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str62.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!" + "'", str65.equals("hi!"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        java.lang.String str17 = user13.getUserId();
        java.lang.String str18 = user13.getUserId();
        boolean boolean19 = user13.isActive();
        java.lang.String str20 = user13.toString();
        java.lang.Class<?> wildcardClass21 = user13.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str20.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        java.lang.String str14 = user10.getLastName();
        java.lang.Class<?> wildcardClass15 = user10.getClass();
        java.lang.String str16 = user10.getUserId();
        boolean boolean17 = user10.isActive();
        java.lang.Class<?> wildcardClass18 = user10.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str16.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        boolean boolean18 = user9.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass19 = user9.getClass();
        java.lang.String str20 = user9.getUserId();
        java.lang.String str21 = user9.toString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str21.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.Class<?> wildcardClass13 = user10.getClass();
        java.lang.Class<?> wildcardClass14 = user10.getClass();
        boolean boolean15 = user10.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        com.iluwatar.converter.User user12 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean14 = user12.equals((java.lang.Object) 1.0d);
        boolean boolean15 = user12.isActive();
        java.lang.Class<?> wildcardClass16 = user12.getClass();
        boolean boolean17 = user12.isActive();
        boolean boolean18 = user12.isActive();
        boolean boolean19 = user12.isActive();
        boolean boolean20 = user12.isActive();
        java.lang.String str21 = user12.getFirstName();
        java.lang.Object obj22 = null;
        boolean boolean23 = user12.equals(obj22);
        java.lang.String str24 = user12.getLastName();
        com.iluwatar.converter.User user29 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean31 = user29.equals((java.lang.Object) 1.0d);
        java.lang.String str32 = user29.toString();
        boolean boolean33 = user12.equals((java.lang.Object) user29);
        boolean boolean34 = user4.equals((java.lang.Object) user29);
        com.iluwatar.converter.User user39 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean41 = user39.equals((java.lang.Object) 1.0d);
        java.lang.String str42 = user39.getUserId();
        java.lang.Class<?> wildcardClass43 = user39.getClass();
        boolean boolean44 = user39.isActive();
        java.lang.String str45 = user39.getFirstName();
        boolean boolean46 = user29.equals((java.lang.Object) user39);
        java.lang.String str47 = user39.getFirstName();
        java.lang.String str48 = user39.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str32.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str48.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getFirstName();
        java.lang.String str18 = user4.getFirstName();
        java.lang.String str19 = user4.toString();
        com.iluwatar.converter.User user24 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}");
        boolean boolean25 = user4.equals((java.lang.Object) "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}");
        java.lang.String str26 = user4.getLastName();
        java.lang.String str27 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str19.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        java.lang.String str12 = user4.getUserId();
        boolean boolean13 = user4.isActive();
        java.lang.String str14 = user4.getFirstName();
        java.lang.Object obj15 = null;
        boolean boolean16 = user4.equals(obj15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        boolean boolean17 = user4.isActive();
        com.iluwatar.converter.User user22 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean24 = user22.equals((java.lang.Object) 1.0d);
        boolean boolean25 = user22.isActive();
        java.lang.Class<?> wildcardClass26 = user22.getClass();
        java.lang.String str27 = user22.toString();
        java.lang.String str28 = user22.toString();
        boolean boolean30 = user22.equals((java.lang.Object) 1.0f);
        boolean boolean31 = user4.equals((java.lang.Object) user22);
        java.lang.String str32 = user22.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str27.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str28.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.String str11 = user4.getUserId();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.getFirstName();
        com.iluwatar.converter.User user18 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass19 = user18.getClass();
        java.lang.String str20 = user18.getUserId();
        boolean boolean21 = user4.equals((java.lang.Object) user18);
        java.lang.String str22 = user4.getLastName();
        java.lang.Class<?> wildcardClass23 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}'}");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        java.lang.String str14 = user10.getLastName();
        java.lang.Object obj15 = null;
        boolean boolean16 = user10.equals(obj15);
        java.lang.String str17 = user10.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.String str11 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", false, "");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "hi!", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        boolean boolean18 = user9.equals((java.lang.Object) 1L);
        java.lang.String str19 = user9.getUserId();
        java.lang.Class<?> wildcardClass20 = user9.getClass();
        java.lang.String str21 = user9.getUserId();
        java.lang.String str22 = user9.getLastName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", "User{firstName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        boolean boolean24 = user21.isActive();
        java.lang.Class<?> wildcardClass25 = user21.getClass();
        java.lang.String str26 = user21.getUserId();
        boolean boolean27 = user4.equals((java.lang.Object) user21);
        java.lang.String str28 = user21.getLastName();
        java.lang.Class<?> wildcardClass29 = user21.getClass();
        java.lang.String str30 = user21.getLastName();
        java.lang.Class<?> wildcardClass31 = user21.getClass();
        java.lang.Class<?> wildcardClass32 = user21.getClass();
        com.iluwatar.converter.User user37 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean39 = user37.equals((java.lang.Object) 1.0d);
        boolean boolean40 = user37.isActive();
        java.lang.Class<?> wildcardClass41 = user37.getClass();
        boolean boolean42 = user37.isActive();
        boolean boolean43 = user37.isActive();
        boolean boolean44 = user37.isActive();
        boolean boolean45 = user21.equals((java.lang.Object) boolean44);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean23 = user21.equals((java.lang.Object) 1.0d);
        boolean boolean24 = user21.isActive();
        java.lang.Class<?> wildcardClass25 = user21.getClass();
        java.lang.String str26 = user21.getUserId();
        boolean boolean27 = user4.equals((java.lang.Object) user21);
        java.lang.String str28 = user21.getLastName();
        java.lang.Class<?> wildcardClass29 = user21.getClass();
        java.lang.String str30 = user21.getLastName();
        java.lang.Class<?> wildcardClass31 = user21.getClass();
        boolean boolean32 = user21.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getLastName();
        java.lang.String str12 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str12.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.Class<?> wildcardClass10 = user4.getClass();
        java.lang.String str11 = user4.getLastName();
        java.lang.String str12 = user4.getLastName();
        java.lang.String str13 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.toString();
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.getFirstName();
        java.lang.Class<?> wildcardClass10 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        boolean boolean18 = user9.equals((java.lang.Object) 1L);
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str24 = user23.getUserId();
        java.lang.String str25 = user23.getLastName();
        java.lang.String str26 = user23.getLastName();
        java.lang.String str27 = user23.getUserId();
        boolean boolean28 = user9.equals((java.lang.Object) str27);
        boolean boolean29 = user9.isActive();
        boolean boolean30 = user9.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str24.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str25.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str26.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str27.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str14 = user4.getFirstName();
        java.lang.String str15 = user4.getFirstName();
        java.lang.String str16 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", true, "");
        java.lang.String str5 = user4.getUserId();
        boolean boolean6 = user4.isActive();
        java.lang.String str7 = user4.getFirstName();
        java.lang.String str8 = user4.getUserId();
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("hi!", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", true, "hi!");
        boolean boolean14 = user13.isActive();
        java.lang.String str15 = user13.toString();
        boolean boolean16 = user4.equals((java.lang.Object) str15);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}" + "'", str15.equals("User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getFirstName();
        java.lang.String str7 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str7.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        com.iluwatar.converter.User user11 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str12 = user11.getFirstName();
        java.lang.Class<?> wildcardClass13 = user11.getClass();
        boolean boolean14 = user4.equals((java.lang.Object) user11);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId=''}", false, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass9 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str14 = user4.getLastName();
        java.lang.String str15 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", true, "hi!");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getFirstName();
        java.lang.String str8 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='hi!', lastName='', isActive=true, userId=''}'}", "hi!", false, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str14 = user4.getLastName();
        boolean boolean15 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.String str11 = user4.getUserId();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.getFirstName();
        com.iluwatar.converter.User user18 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass19 = user18.getClass();
        java.lang.String str20 = user18.getUserId();
        boolean boolean21 = user4.equals((java.lang.Object) user18);
        java.lang.String str22 = user18.getFirstName();
        boolean boolean23 = user18.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        boolean boolean14 = user9.isActive();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user9.isActive();
        boolean boolean17 = user9.isActive();
        boolean boolean18 = user4.equals((java.lang.Object) user9);
        java.lang.Object obj19 = null;
        boolean boolean20 = user4.equals(obj19);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getLastName();
        java.lang.String str18 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }
}

