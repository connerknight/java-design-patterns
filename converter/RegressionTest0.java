import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
        java.lang.String str28 = user4.getUserId();
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
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
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
        boolean boolean29 = user21.isActive();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
        boolean boolean19 = user4.isActive();
        java.lang.Class<?> wildcardClass20 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str9 = user4.getFirstName();
        java.lang.String str10 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        java.lang.String str7 = user4.getUserId();
        java.lang.String str8 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
        boolean boolean18 = user4.isActive();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str11.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getLastName();
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
        java.lang.String str36 = user4.getUserId();
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
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
        boolean boolean21 = user9.isActive();
        java.lang.String str22 = user9.getUserId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getLastName();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
        java.lang.String str26 = user4.getLastName();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.toString();
        java.lang.String str18 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        boolean boolean10 = user4.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        boolean boolean17 = user4.isActive();
        boolean boolean18 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
        java.lang.Class<?> wildcardClass19 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
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
        java.lang.String str29 = user4.getUserId();
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        boolean boolean11 = user4.isActive();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user9.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.getUserId();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        java.lang.Class<?> wildcardClass12 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str9 = user4.getFirstName();
        java.lang.String str10 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.String str8 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", true, "");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
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
        java.lang.String str26 = user21.getLastName();
        boolean boolean27 = user21.isActive();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.toString();
        java.lang.String str7 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getUserId();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
        java.lang.String str19 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", false, "hi!");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getFirstName();
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = user4.equals(obj18);
        java.lang.String str20 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str20.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
        java.lang.String str30 = user4.getUserId();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
        java.lang.String str31 = user21.toString();
        java.lang.String str32 = user21.toString();
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str31.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str32.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
        java.lang.String str28 = user4.toString();
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str28.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", false, "hi!");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.String str11 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
        java.lang.String str30 = user4.toString();
        java.lang.String str31 = user4.getLastName();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str30.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str14 = user4.getUserId();
        boolean boolean16 = user4.equals((java.lang.Object) (byte) 100);
        java.lang.String str17 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "hi!");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.toString();
        java.lang.String str7 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getLastName();
        boolean boolean18 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getFirstName();
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = user4.equals(obj18);
        boolean boolean20 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getLastName();
        java.lang.Object obj8 = null;
        boolean boolean9 = user4.equals(obj8);
        java.lang.String str10 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        java.lang.String str7 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str7.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", false, "hi!");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getUserId();
        com.iluwatar.converter.User user11 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean13 = user11.equals((java.lang.Object) 1.0d);
        boolean boolean14 = user11.isActive();
        java.lang.Class<?> wildcardClass15 = user11.getClass();
        boolean boolean16 = user4.equals((java.lang.Object) user11);
        java.lang.String str17 = user11.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str9 = user4.getFirstName();
        java.lang.String str10 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        java.lang.String str30 = user21.toString();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str30.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.String str11 = user4.getUserId();
        java.lang.String str12 = user4.getFirstName();
        boolean boolean13 = user4.isActive();
        java.lang.String str14 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        boolean boolean15 = user10.equals((java.lang.Object) "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str16 = user10.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str16.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
        java.lang.String str28 = user21.getFirstName();
        java.lang.String str29 = user21.getUserId();
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
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
        com.iluwatar.converter.User user39 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str40 = user39.getFirstName();
        java.lang.Class<?> wildcardClass41 = user39.getClass();
        java.lang.Class<?> wildcardClass42 = user39.getClass();
        com.iluwatar.converter.User user47 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean49 = user47.equals((java.lang.Object) 1.0d);
        boolean boolean50 = user47.isActive();
        java.lang.Class<?> wildcardClass51 = user47.getClass();
        boolean boolean52 = user47.isActive();
        boolean boolean53 = user47.isActive();
        boolean boolean54 = user47.isActive();
        boolean boolean55 = user47.isActive();
        java.lang.String str56 = user47.getFirstName();
        java.lang.Object obj57 = null;
        boolean boolean58 = user47.equals(obj57);
        java.lang.String str59 = user47.getLastName();
        com.iluwatar.converter.User user64 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean66 = user64.equals((java.lang.Object) 1.0d);
        java.lang.String str67 = user64.toString();
        boolean boolean68 = user47.equals((java.lang.Object) user64);
        boolean boolean69 = user39.equals((java.lang.Object) user64);
        com.iluwatar.converter.User user74 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean76 = user74.equals((java.lang.Object) 1.0d);
        java.lang.String str77 = user74.getUserId();
        java.lang.Class<?> wildcardClass78 = user74.getClass();
        boolean boolean79 = user74.isActive();
        java.lang.String str80 = user74.getFirstName();
        boolean boolean81 = user64.equals((java.lang.Object) user74);
        java.lang.String str82 = user64.getLastName();
        boolean boolean83 = user4.equals((java.lang.Object) str82);
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
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str40.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str67.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!" + "'", str82.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
        java.lang.Class<?> wildcardClass30 = user21.getClass();
        com.iluwatar.converter.User user35 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "", false, "hi!");
        java.lang.String str36 = user35.getUserId();
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean43 = user41.equals((java.lang.Object) 1.0d);
        java.lang.String str44 = user41.getUserId();
        java.lang.Class<?> wildcardClass45 = user41.getClass();
        boolean boolean46 = user35.equals((java.lang.Object) wildcardClass45);
        boolean boolean47 = user21.equals((java.lang.Object) user35);
        java.lang.String str48 = user35.getFirstName();
        java.lang.String str49 = user35.getUserId();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str48.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
        java.lang.String str30 = user21.getLastName();
        com.iluwatar.converter.User user35 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean37 = user35.equals((java.lang.Object) 1.0d);
        boolean boolean39 = user35.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user44 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean46 = user44.equals((java.lang.Object) 10L);
        boolean boolean47 = user35.equals((java.lang.Object) user44);
        boolean boolean48 = user35.isActive();
        boolean boolean49 = user21.equals((java.lang.Object) user35);
        java.lang.Class<?> wildcardClass50 = user21.getClass();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", true, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "hi!", true, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.getUserId();
        java.lang.String str8 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.String str11 = user4.getUserId();
        java.lang.String str12 = user4.getFirstName();
        boolean boolean13 = user4.isActive();
        com.iluwatar.converter.User user18 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean20 = user18.equals((java.lang.Object) 1.0d);
        boolean boolean21 = user18.isActive();
        java.lang.Class<?> wildcardClass22 = user18.getClass();
        com.iluwatar.converter.User user27 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean29 = user27.equals((java.lang.Object) 1.0d);
        boolean boolean31 = user27.equals((java.lang.Object) 100.0d);
        boolean boolean32 = user18.equals((java.lang.Object) boolean31);
        boolean boolean33 = user4.equals((java.lang.Object) boolean32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.String str8 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        java.lang.String str14 = user10.getLastName();
        java.lang.Class<?> wildcardClass15 = user10.getClass();
        java.lang.String str16 = user10.getUserId();
        java.lang.String str17 = user10.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str16.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        java.lang.String str6 = user4.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        java.lang.String str17 = user13.getLastName();
        com.iluwatar.converter.User user22 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user27 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean29 = user27.equals((java.lang.Object) 1.0d);
        boolean boolean30 = user27.isActive();
        java.lang.Class<?> wildcardClass31 = user27.getClass();
        java.lang.String str32 = user27.getUserId();
        boolean boolean33 = user27.isActive();
        boolean boolean34 = user22.equals((java.lang.Object) user27);
        boolean boolean36 = user27.equals((java.lang.Object) 1L);
        java.lang.String str37 = user27.getUserId();
        java.lang.Class<?> wildcardClass38 = user27.getClass();
        java.lang.String str39 = user27.getFirstName();
        java.lang.Class<?> wildcardClass40 = user27.getClass();
        boolean boolean41 = user13.equals((java.lang.Object) wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        java.lang.String str12 = user9.getUserId();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        boolean boolean14 = user4.equals((java.lang.Object) wildcardClass13);
        boolean boolean15 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        java.lang.String str5 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
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
        java.lang.Class<?> wildcardClass35 = user27.getClass();
        boolean boolean36 = user4.equals((java.lang.Object) wildcardClass35);
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean43 = user41.equals((java.lang.Object) 1.0d);
        boolean boolean44 = user41.isActive();
        java.lang.Class<?> wildcardClass45 = user41.getClass();
        boolean boolean46 = user41.isActive();
        boolean boolean47 = user41.isActive();
        boolean boolean48 = user41.isActive();
        boolean boolean49 = user41.isActive();
        java.lang.String str50 = user41.getFirstName();
        java.lang.Object obj51 = null;
        boolean boolean52 = user41.equals(obj51);
        boolean boolean53 = user4.equals((java.lang.Object) user41);
        boolean boolean55 = user4.equals((java.lang.Object) "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
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
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getLastName();
        java.lang.Object obj8 = null;
        boolean boolean9 = user4.equals(obj8);
        java.lang.String str10 = user4.getFirstName();
        boolean boolean11 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getUserId();
        com.iluwatar.converter.User user11 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean13 = user11.equals((java.lang.Object) 1.0d);
        boolean boolean14 = user11.isActive();
        java.lang.Class<?> wildcardClass15 = user11.getClass();
        boolean boolean16 = user4.equals((java.lang.Object) user11);
        java.lang.String str17 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
        java.lang.String str28 = user4.getUserId();
        java.lang.String str29 = user4.getUserId();
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str14 = user4.getFirstName();
        java.lang.String str15 = user4.getUserId();
        java.lang.Class<?> wildcardClass16 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.Object obj6 = null;
        boolean boolean7 = user4.equals(obj6);
        java.lang.String str8 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        java.lang.String str8 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
        java.lang.String str26 = user21.getLastName();
        java.lang.Class<?> wildcardClass27 = user21.getClass();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        boolean boolean5 = user4.isActive();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", true, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str10 = user9.getLastName();
        java.lang.Object obj11 = null;
        boolean boolean12 = user9.equals(obj11);
        boolean boolean13 = user4.equals((java.lang.Object) user9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
        java.lang.String str29 = user9.getLastName();
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "");
        boolean boolean5 = user4.isActive();
        boolean boolean7 = user4.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str10 = user9.getLastName();
        boolean boolean11 = user4.equals((java.lang.Object) str10);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", true, "hi!");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        boolean boolean18 = user10.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str16.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
        java.lang.String str31 = user21.toString();
        java.lang.String str32 = user21.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str31.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        boolean boolean10 = user9.isActive();
        boolean boolean11 = user4.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}", true, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
        java.lang.String str28 = user4.getUserId();
        com.iluwatar.converter.User user33 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean35 = user33.equals((java.lang.Object) 1.0d);
        boolean boolean37 = user33.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user42 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean44 = user42.equals((java.lang.Object) 10L);
        boolean boolean45 = user33.equals((java.lang.Object) user42);
        com.iluwatar.converter.User user50 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user55 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean57 = user55.equals((java.lang.Object) 1.0d);
        boolean boolean58 = user55.isActive();
        java.lang.Class<?> wildcardClass59 = user55.getClass();
        java.lang.String str60 = user55.getUserId();
        boolean boolean61 = user55.isActive();
        boolean boolean62 = user50.equals((java.lang.Object) user55);
        java.lang.String str63 = user50.getFirstName();
        boolean boolean64 = user33.equals((java.lang.Object) str63);
        java.lang.Class<?> wildcardClass65 = user33.getClass();
        boolean boolean66 = user4.equals((java.lang.Object) wildcardClass65);
        com.iluwatar.converter.User user71 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        boolean boolean72 = user4.equals((java.lang.Object) user71);
        java.lang.String str73 = user71.toString();
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}" + "'", str73.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
        java.lang.String str17 = user4.getLastName();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getUserId();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        java.lang.String str8 = user4.toString();
        boolean boolean9 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}" + "'", str8.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        java.lang.String str29 = user4.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str29.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        java.lang.String str37 = user28.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str37.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        java.lang.String str28 = user21.getFirstName();
        boolean boolean29 = user21.isActive();
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        java.lang.String str5 = user4.getUserId();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean12 = user10.equals((java.lang.Object) 1.0d);
        boolean boolean13 = user10.isActive();
        java.lang.Class<?> wildcardClass14 = user10.getClass();
        java.lang.String str15 = user10.toString();
        java.lang.String str16 = user10.toString();
        boolean boolean18 = user10.equals((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass19 = user10.getClass();
        java.lang.String str20 = user10.getLastName();
        boolean boolean21 = user4.equals((java.lang.Object) str20);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str15.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str16.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean25 = user23.equals((java.lang.Object) 1.0d);
        boolean boolean26 = user23.isActive();
        java.lang.Class<?> wildcardClass27 = user23.getClass();
        boolean boolean28 = user23.isActive();
        boolean boolean29 = user23.isActive();
        boolean boolean30 = user23.isActive();
        boolean boolean31 = user23.isActive();
        java.lang.String str32 = user23.getFirstName();
        boolean boolean33 = user4.equals((java.lang.Object) user23);
        boolean boolean34 = user23.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.getLastName();
        java.lang.String str8 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        java.lang.String str14 = user10.getLastName();
        java.lang.String str15 = user10.toString();
        java.lang.Class<?> wildcardClass16 = user10.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str15.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        java.lang.Class<?> wildcardClass15 = user9.getClass();
        boolean boolean16 = user4.equals((java.lang.Object) wildcardClass15);
        java.lang.String str17 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        java.lang.String str7 = user4.getFirstName();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.toString();
        java.lang.String str7 = user4.getUserId();
        com.iluwatar.converter.User user12 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user17 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean19 = user17.equals((java.lang.Object) 1.0d);
        boolean boolean20 = user17.isActive();
        java.lang.Class<?> wildcardClass21 = user17.getClass();
        java.lang.String str22 = user17.getUserId();
        boolean boolean23 = user17.isActive();
        boolean boolean24 = user12.equals((java.lang.Object) user17);
        com.iluwatar.converter.User user29 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean31 = user29.equals((java.lang.Object) 1.0d);
        boolean boolean32 = user29.isActive();
        java.lang.Class<?> wildcardClass33 = user29.getClass();
        java.lang.String str34 = user29.getUserId();
        boolean boolean35 = user12.equals((java.lang.Object) user29);
        java.lang.String str36 = user29.getLastName();
        boolean boolean37 = user4.equals((java.lang.Object) user29);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
        java.lang.Class<?> wildcardClass16 = user4.getClass();
        boolean boolean17 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getLastName();
        java.lang.Class<?> wildcardClass18 = user4.getClass();
        java.lang.String str19 = user4.toString();
        java.lang.String str20 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str19.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", true, "hi!");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        java.lang.String str30 = user9.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.toString();
        java.lang.String str15 = user9.toString();
        boolean boolean16 = user4.equals((java.lang.Object) str15);
        java.lang.String str17 = user4.toString();
        java.lang.String str18 = user4.getUserId();
        boolean boolean19 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str15.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}" + "'", str17.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getUserId();
        boolean boolean18 = user4.isActive();
        java.lang.String str19 = user4.getLastName();
        java.lang.Class<?> wildcardClass20 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        java.lang.String str12 = user4.getUserId();
        java.lang.String str13 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean7 = user4.equals((java.lang.Object) (short) -1);
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.getFirstName();
        com.iluwatar.converter.User user14 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean16 = user14.equals((java.lang.Object) 1.0d);
        boolean boolean18 = user14.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean25 = user23.equals((java.lang.Object) 10L);
        boolean boolean26 = user14.equals((java.lang.Object) user23);
        java.lang.String str27 = user23.getUserId();
        java.lang.String str28 = user23.getUserId();
        java.lang.String str29 = user23.getUserId();
        boolean boolean30 = user4.equals((java.lang.Object) str29);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.toString();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.toString();
        boolean boolean9 = user4.equals((java.lang.Object) "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", true, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", false, "");
        java.lang.Class<?> wildcardClass10 = user9.getClass();
        boolean boolean11 = user4.equals((java.lang.Object) user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        boolean boolean6 = user4.equals((java.lang.Object) 0L);
        java.lang.String str7 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
        java.lang.String str31 = user4.getLastName();
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", true, "");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getLastName();
        java.lang.String str18 = user4.toString();
        boolean boolean19 = user4.isActive();
        java.lang.Class<?> wildcardClass20 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str18.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        java.lang.String str6 = user4.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean5 = user4.isActive();
        java.lang.Object obj6 = null;
        boolean boolean7 = user4.equals(obj6);
        java.lang.String str8 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}", false, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
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
        java.lang.String str28 = user21.getFirstName();
        java.lang.String str29 = user21.getLastName();
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
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        java.lang.String str14 = user10.getLastName();
        java.lang.Class<?> wildcardClass15 = user10.getClass();
        java.lang.String str16 = user10.getUserId();
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass22 = user21.getClass();
        boolean boolean24 = user21.equals((java.lang.Object) (short) -1);
        java.lang.String str25 = user21.toString();
        java.lang.String str26 = user21.getUserId();
        java.lang.String str27 = user21.getUserId();
        boolean boolean28 = user10.equals((java.lang.Object) user21);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str16.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str25.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        java.lang.String str20 = user9.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
        java.lang.Class<?> wildcardClass23 = user9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        java.lang.String str14 = user10.getLastName();
        java.lang.Class<?> wildcardClass15 = user10.getClass();
        java.lang.String str16 = user10.getUserId();
        java.lang.String str17 = user10.toString();
        com.iluwatar.converter.User user22 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.String str23 = user22.getLastName();
        boolean boolean24 = user10.equals((java.lang.Object) user22);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str16.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str17.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
        boolean boolean21 = user9.isActive();
        java.lang.String str22 = user9.getFirstName();
        boolean boolean23 = user9.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        java.lang.String str28 = user21.getFirstName();
        java.lang.Class<?> wildcardClass29 = user21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
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
        java.lang.String str20 = user4.getUserId();
        boolean boolean21 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        java.lang.String str7 = user4.toString();
        boolean boolean8 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", true, "");
        java.lang.String str5 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getFirstName();
        java.lang.String str7 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", false, "hi!");
        java.lang.String str5 = user4.getFirstName();
        boolean boolean6 = user4.isActive();
        boolean boolean7 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
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
        java.lang.String str26 = user21.getLastName();
        java.lang.String str27 = user21.getUserId();
        java.lang.Class<?> wildcardClass28 = user21.getClass();
        java.lang.String str29 = user21.getLastName();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.Class<?> wildcardClass10 = user4.getClass();
        java.lang.String str11 = user4.getFirstName();
        java.lang.String str12 = user4.getFirstName();
        java.lang.String str13 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        java.lang.String str28 = user4.toString();
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}" + "'", str28.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.getLastName();
        java.lang.String str8 = user4.getFirstName();
        boolean boolean9 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getLastName();
        boolean boolean7 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
        java.lang.String str28 = user21.getFirstName();
        boolean boolean29 = user21.isActive();
        com.iluwatar.converter.User user34 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean36 = user34.equals((java.lang.Object) 1.0d);
        java.lang.String str37 = user34.toString();
        java.lang.String str38 = user34.toString();
        java.lang.String str39 = user34.getLastName();
        java.lang.String str40 = user34.getFirstName();
        boolean boolean41 = user21.equals((java.lang.Object) str40);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str37.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str38.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}");
        java.lang.String str5 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", true, "hi!");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getFirstName();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean7 = user4.equals((java.lang.Object) (short) -1);
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.getUserId();
        java.lang.Class<?> wildcardClass10 = user4.getClass();
        java.lang.String str11 = user4.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str11.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.String str5 = user4.toString();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str11 = user10.getLastName();
        java.lang.String str12 = user10.toString();
        boolean boolean13 = user4.equals((java.lang.Object) str12);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str12.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        boolean boolean15 = user10.equals((java.lang.Object) "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        boolean boolean16 = user10.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        com.iluwatar.converter.User user34 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", false, "hi!");
        boolean boolean35 = user9.equals((java.lang.Object) "hi!");
        com.iluwatar.converter.User user40 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user45 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean47 = user45.equals((java.lang.Object) 1.0d);
        boolean boolean48 = user45.isActive();
        java.lang.Class<?> wildcardClass49 = user45.getClass();
        java.lang.String str50 = user45.getUserId();
        boolean boolean51 = user45.isActive();
        boolean boolean52 = user40.equals((java.lang.Object) user45);
        boolean boolean54 = user45.equals((java.lang.Object) 1L);
        java.lang.String str55 = user45.getUserId();
        boolean boolean56 = user9.equals((java.lang.Object) str55);
        java.lang.String str57 = user9.getFirstName();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", false, "hi!");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        boolean boolean13 = user10.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
        java.lang.String str22 = user4.getLastName();
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='hi!', lastName='', isActive=true, userId=''}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", true, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", true, "hi!");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", false, "hi!");
        java.lang.String str5 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        java.lang.String str5 = user4.getUserId();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean7 = user4.equals((java.lang.Object) (short) -1);
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getFirstName();
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = user4.equals(obj18);
        java.lang.String str20 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getUserId();
        boolean boolean18 = user4.isActive();
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user28 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean30 = user28.equals((java.lang.Object) 1.0d);
        boolean boolean31 = user28.isActive();
        java.lang.Class<?> wildcardClass32 = user28.getClass();
        java.lang.String str33 = user28.getUserId();
        boolean boolean34 = user28.isActive();
        boolean boolean35 = user23.equals((java.lang.Object) user28);
        boolean boolean37 = user28.equals((java.lang.Object) 1L);
        boolean boolean38 = user4.equals((java.lang.Object) boolean37);
        com.iluwatar.converter.User user43 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean45 = user43.equals((java.lang.Object) 1.0d);
        boolean boolean47 = user43.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user52 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean54 = user52.equals((java.lang.Object) 10L);
        boolean boolean55 = user43.equals((java.lang.Object) user52);
        java.lang.Class<?> wildcardClass56 = user43.getClass();
        java.lang.String str57 = user43.getFirstName();
        boolean boolean58 = user4.equals((java.lang.Object) user43);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        com.iluwatar.converter.User user11 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str12 = user11.getLastName();
        java.lang.String str13 = user11.getLastName();
        java.lang.String str14 = user11.getUserId();
        boolean boolean15 = user4.equals((java.lang.Object) str14);
        boolean boolean17 = user4.equals((java.lang.Object) (short) 10);
        boolean boolean18 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        java.lang.String str18 = user4.getLastName();
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean25 = user23.equals((java.lang.Object) 1.0d);
        boolean boolean26 = user23.isActive();
        java.lang.Class<?> wildcardClass27 = user23.getClass();
        boolean boolean28 = user23.isActive();
        boolean boolean29 = user23.isActive();
        java.lang.String str30 = user23.getUserId();
        boolean boolean32 = user23.equals((java.lang.Object) 100.0d);
        java.lang.String str33 = user23.getFirstName();
        boolean boolean34 = user23.isActive();
        boolean boolean35 = user4.equals((java.lang.Object) boolean34);
        boolean boolean36 = user4.isActive();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        boolean boolean5 = user4.isActive();
        java.lang.Object obj6 = null;
        boolean boolean7 = user4.equals(obj6);
        java.lang.String str8 = user4.getLastName();
        java.lang.String str9 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = user4.equals(obj16);
        java.lang.String str18 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str18.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", true, "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.String str5 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "", false, "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user26 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean28 = user26.equals((java.lang.Object) 1.0d);
        boolean boolean29 = user26.isActive();
        java.lang.Class<?> wildcardClass30 = user26.getClass();
        java.lang.String str31 = user26.getUserId();
        boolean boolean32 = user26.isActive();
        boolean boolean33 = user21.equals((java.lang.Object) user26);
        java.lang.String str34 = user21.getFirstName();
        boolean boolean35 = user4.equals((java.lang.Object) str34);
        java.lang.Class<?> wildcardClass36 = user4.getClass();
        java.lang.String str37 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str37.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean25 = user23.equals((java.lang.Object) 1.0d);
        boolean boolean26 = user23.isActive();
        java.lang.Class<?> wildcardClass27 = user23.getClass();
        boolean boolean28 = user23.isActive();
        boolean boolean29 = user23.isActive();
        boolean boolean30 = user23.isActive();
        boolean boolean31 = user23.isActive();
        java.lang.String str32 = user23.getFirstName();
        boolean boolean33 = user4.equals((java.lang.Object) user23);
        java.lang.String str34 = user23.toString();
        java.lang.String str35 = user23.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str34.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        java.lang.String str6 = user4.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
        java.lang.Class<?> wildcardClass47 = user29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.String str11 = user4.getUserId();
        boolean boolean12 = user4.isActive();
        boolean boolean13 = user4.isActive();
        com.iluwatar.converter.User user18 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean20 = user18.equals((java.lang.Object) 1.0d);
        java.lang.String str21 = user18.toString();
        java.lang.String str22 = user18.toString();
        java.lang.String str23 = user18.getUserId();
        java.lang.String str24 = user18.toString();
        boolean boolean25 = user4.equals((java.lang.Object) str24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str21.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str22.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str24.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
        java.lang.Class<?> wildcardClass30 = user21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        java.lang.String str28 = user21.getFirstName();
        boolean boolean29 = user21.isActive();
        boolean boolean30 = user21.isActive();
        java.lang.Class<?> wildcardClass31 = user21.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
        java.lang.String str36 = user28.toString();
        java.lang.String str37 = user28.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str36.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str37.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        java.lang.String str7 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean7 = user4.equals((java.lang.Object) (short) -1);
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.getUserId();
        java.lang.String str11 = user4.getFirstName();
        java.lang.String str12 = user4.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str12.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        java.lang.String str33 = user21.getLastName();
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
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.toString();
        java.lang.String str15 = user9.toString();
        boolean boolean16 = user4.equals((java.lang.Object) str15);
        java.lang.String str17 = user4.toString();
        java.lang.String str18 = user4.getUserId();
        java.lang.String str19 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str15.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}" + "'", str17.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.getUserId();
        java.lang.String str8 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        java.lang.String str7 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        java.lang.String str7 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}" + "'", str7.equals("User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='hi!', lastName='', isActive=true, userId=''}", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", false, "hi!");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        com.iluwatar.converter.User user14 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean16 = user14.equals((java.lang.Object) 1.0d);
        boolean boolean17 = user14.isActive();
        java.lang.Class<?> wildcardClass18 = user14.getClass();
        java.lang.String str19 = user14.toString();
        java.lang.String str20 = user14.toString();
        boolean boolean21 = user9.equals((java.lang.Object) str20);
        boolean boolean22 = user4.equals((java.lang.Object) str20);
        java.lang.String str23 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str19.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str20.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str23.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean6 = user4.isActive();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.getFirstName();
        boolean boolean11 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.String str5 = user4.getFirstName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        boolean boolean11 = user10.isActive();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        boolean boolean13 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str14 = user4.getUserId();
        java.lang.String str15 = user4.getLastName();
        boolean boolean16 = user4.isActive();
        java.lang.String str17 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
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
        java.lang.String str22 = user13.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user14 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean16 = user14.equals((java.lang.Object) 1.0d);
        boolean boolean17 = user14.isActive();
        java.lang.Class<?> wildcardClass18 = user14.getClass();
        java.lang.String str19 = user14.getUserId();
        boolean boolean20 = user14.isActive();
        boolean boolean21 = user9.equals((java.lang.Object) user14);
        boolean boolean22 = user4.equals((java.lang.Object) user9);
        java.lang.String str23 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.getFirstName();
        java.lang.String str14 = user10.toString();
        boolean boolean15 = user10.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str13.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str14.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.getUserId();
        java.lang.String str11 = user4.getUserId();
        boolean boolean12 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user4.toString();
        java.lang.Class<?> wildcardClass14 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean7 = user4.equals((java.lang.Object) (short) -1);
        com.iluwatar.converter.User user12 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str13 = user12.getLastName();
        java.lang.String str14 = user12.getUserId();
        boolean boolean15 = user4.equals((java.lang.Object) user12);
        com.iluwatar.converter.User user20 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str21 = user20.getLastName();
        java.lang.String str22 = user20.getUserId();
        boolean boolean23 = user20.isActive();
        boolean boolean24 = user12.equals((java.lang.Object) user20);
        java.lang.Class<?> wildcardClass25 = user20.getClass();
        java.lang.String str26 = user20.getFirstName();
        java.lang.String str27 = user20.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str26.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str27.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        java.lang.String str40 = user4.getLastName();
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
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", true, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str9 = user4.getFirstName();
        java.lang.String str10 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user9.toString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
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
        boolean boolean21 = user13.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str20.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean7 = user4.isActive();
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str8.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
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
        java.lang.String str26 = user21.getLastName();
        java.lang.String str27 = user21.getUserId();
        com.iluwatar.converter.User user32 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean34 = user32.equals((java.lang.Object) 1.0d);
        boolean boolean36 = user32.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean43 = user41.equals((java.lang.Object) 10L);
        boolean boolean44 = user32.equals((java.lang.Object) user41);
        java.lang.String str45 = user41.getUserId();
        java.lang.String str46 = user41.getUserId();
        boolean boolean48 = user41.equals((java.lang.Object) 1);
        java.lang.String str49 = user41.getLastName();
        boolean boolean50 = user21.equals((java.lang.Object) str49);
        java.lang.String str51 = user21.getUserId();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
        boolean boolean20 = user4.isActive();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        boolean boolean22 = user9.isActive();
        java.lang.String str23 = user9.getLastName();
        boolean boolean24 = user9.isActive();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        boolean boolean19 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        boolean boolean36 = user21.isActive();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        com.iluwatar.converter.User user17 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        boolean boolean18 = user10.equals((java.lang.Object) false);
        java.lang.String str19 = user10.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str19.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
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
        com.iluwatar.converter.User user20 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", true, "");
        java.lang.String str21 = user20.getUserId();
        boolean boolean22 = user20.isActive();
        java.lang.String str23 = user20.getFirstName();
        java.lang.String str24 = user20.getUserId();
        com.iluwatar.converter.User user29 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean31 = user29.equals((java.lang.Object) 1.0d);
        boolean boolean33 = user29.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user38 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean40 = user38.equals((java.lang.Object) 10L);
        boolean boolean41 = user29.equals((java.lang.Object) user38);
        boolean boolean42 = user20.equals((java.lang.Object) user38);
        boolean boolean43 = user4.equals((java.lang.Object) user38);
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str23.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        java.lang.String str5 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", true, "hi!");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getFirstName();
        java.lang.String str8 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.toString();
        java.lang.Class<?> wildcardClass18 = user4.getClass();
        java.lang.String str19 = user4.getFirstName();
        com.iluwatar.converter.User user24 = new com.iluwatar.converter.User("hi!", "", true, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        com.iluwatar.converter.User user29 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean31 = user29.equals((java.lang.Object) 1.0d);
        boolean boolean32 = user29.isActive();
        java.lang.Class<?> wildcardClass33 = user29.getClass();
        java.lang.String str34 = user29.getUserId();
        java.lang.Class<?> wildcardClass35 = user29.getClass();
        boolean boolean36 = user24.equals((java.lang.Object) wildcardClass35);
        boolean boolean37 = user4.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
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
        com.iluwatar.converter.User user46 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean48 = user46.equals((java.lang.Object) 1.0d);
        boolean boolean49 = user46.isActive();
        java.lang.Class<?> wildcardClass50 = user46.getClass();
        java.lang.String str51 = user46.getUserId();
        boolean boolean52 = user46.isActive();
        boolean boolean53 = user41.equals((java.lang.Object) user46);
        com.iluwatar.converter.User user58 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean60 = user58.equals((java.lang.Object) 1.0d);
        boolean boolean61 = user58.isActive();
        java.lang.Class<?> wildcardClass62 = user58.getClass();
        java.lang.String str63 = user58.getUserId();
        boolean boolean64 = user41.equals((java.lang.Object) user58);
        java.lang.String str65 = user58.toString();
        java.lang.String str66 = user58.toString();
        boolean boolean67 = user28.equals((java.lang.Object) str66);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str65.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str66.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean7 = user4.equals((java.lang.Object) (short) -1);
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", true, "");
        java.lang.String str5 = user4.getUserId();
        boolean boolean6 = user4.isActive();
        java.lang.String str7 = user4.getFirstName();
        java.lang.String str8 = user4.getUserId();
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 1.0d);
        boolean boolean17 = user13.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user22 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean24 = user22.equals((java.lang.Object) 10L);
        boolean boolean25 = user13.equals((java.lang.Object) user22);
        boolean boolean26 = user4.equals((java.lang.Object) user22);
        java.lang.Class<?> wildcardClass27 = user22.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
        java.lang.Class<?> wildcardClass20 = user4.getClass();
        java.lang.String str21 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "", false, "hi!");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getUserId();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='hi!', lastName='', isActive=true, userId=''}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        com.iluwatar.converter.User user27 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.String str28 = user27.getFirstName();
        com.iluwatar.converter.User user33 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        boolean boolean34 = user33.isActive();
        boolean boolean35 = user27.equals((java.lang.Object) user33);
        boolean boolean36 = user9.equals((java.lang.Object) boolean35);
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.Class<?> wildcardClass17 = user4.getClass();
        boolean boolean18 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
        com.iluwatar.converter.User user40 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean41 = user40.isActive();
        java.lang.Object obj42 = null;
        boolean boolean43 = user40.equals(obj42);
        java.lang.Class<?> wildcardClass44 = user40.getClass();
        java.lang.String str45 = user40.toString();
        boolean boolean46 = user21.equals((java.lang.Object) str45);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str45.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.getFirstName();
        java.lang.String str11 = user4.getUserId();
        java.lang.String str12 = user4.getLastName();
        boolean boolean13 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str11.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str9 = user4.getUserId();
        java.lang.Class<?> wildcardClass10 = user4.getClass();
        java.lang.String str11 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
        java.lang.String str34 = user21.getUserId();
        java.lang.String str35 = user21.toString();
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
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str35.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.getFirstName();
        java.lang.String str11 = user4.getUserId();
        java.lang.String str12 = user4.getUserId();
        com.iluwatar.converter.User user17 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean19 = user17.equals((java.lang.Object) 1.0d);
        boolean boolean20 = user17.isActive();
        java.lang.Class<?> wildcardClass21 = user17.getClass();
        java.lang.String str22 = user17.toString();
        java.lang.String str23 = user17.toString();
        java.lang.String str24 = user17.getUserId();
        boolean boolean25 = user17.isActive();
        java.lang.String str26 = user17.getFirstName();
        com.iluwatar.converter.User user31 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass32 = user31.getClass();
        java.lang.String str33 = user31.getUserId();
        boolean boolean34 = user17.equals((java.lang.Object) user31);
        boolean boolean35 = user4.equals((java.lang.Object) boolean34);
        boolean boolean36 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str11.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str12.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str22.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str23.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "", false, "hi!");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getLastName();
        java.lang.Object obj8 = null;
        boolean boolean9 = user4.equals(obj8);
        java.lang.String str10 = user4.getFirstName();
        java.lang.String str11 = user4.getLastName();
        boolean boolean12 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str11.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        java.lang.String str17 = user13.getUserId();
        java.lang.String str18 = user13.getUserId();
        java.lang.String str19 = user13.getLastName();
        java.lang.String str20 = user13.getUserId();
        java.lang.String str21 = user13.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str21.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='hi!', lastName='', isActive=true, userId=''}", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "User{firstName='hi!', lastName='', isActive=true, userId=''}");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        boolean boolean6 = user4.equals((java.lang.Object) 0L);
        boolean boolean7 = user4.isActive();
        java.lang.String str8 = user4.getLastName();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getLastName();
        java.lang.String str8 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str7.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str8.equals("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) 100.0d);
        java.lang.String str14 = user4.getFirstName();
        boolean boolean15 = user4.isActive();
        java.lang.String str16 = user4.getFirstName();
        java.lang.String str17 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean25 = user23.equals((java.lang.Object) 1.0d);
        boolean boolean26 = user23.isActive();
        java.lang.Class<?> wildcardClass27 = user23.getClass();
        boolean boolean28 = user23.isActive();
        boolean boolean29 = user23.isActive();
        boolean boolean30 = user23.isActive();
        boolean boolean31 = user23.isActive();
        java.lang.String str32 = user23.getFirstName();
        boolean boolean33 = user4.equals((java.lang.Object) user23);
        java.lang.Class<?> wildcardClass34 = user23.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.getFirstName();
        java.lang.String str14 = user10.getLastName();
        java.lang.Class<?> wildcardClass15 = user10.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str13.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getLastName();
        java.lang.String str18 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        boolean boolean6 = user4.isActive();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
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
        java.lang.String str28 = user21.getFirstName();
        boolean boolean29 = user21.isActive();
        java.lang.String str30 = user21.getLastName();
        java.lang.String str31 = user21.getUserId();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.toString();
        java.lang.String str8 = user4.toString();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.getLastName();
        java.lang.String str8 = user4.toString();
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "hi!");
        java.lang.String str14 = user13.getFirstName();
        java.lang.String str15 = user13.getUserId();
        java.lang.Class<?> wildcardClass16 = user13.getClass();
        boolean boolean17 = user4.equals((java.lang.Object) user13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.String str10 = user9.getFirstName();
        com.iluwatar.converter.User user15 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        boolean boolean16 = user15.isActive();
        boolean boolean17 = user9.equals((java.lang.Object) user15);
        boolean boolean18 = user4.equals((java.lang.Object) user9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean6 = user4.isActive();
        com.iluwatar.converter.User user11 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        com.iluwatar.converter.User user16 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean18 = user16.equals((java.lang.Object) 1.0d);
        boolean boolean19 = user16.isActive();
        java.lang.Class<?> wildcardClass20 = user16.getClass();
        java.lang.String str21 = user16.toString();
        java.lang.String str22 = user16.toString();
        boolean boolean23 = user11.equals((java.lang.Object) str22);
        com.iluwatar.converter.User user28 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean30 = user28.equals((java.lang.Object) 1.0d);
        boolean boolean31 = user28.isActive();
        java.lang.Class<?> wildcardClass32 = user28.getClass();
        java.lang.String str33 = user28.toString();
        boolean boolean34 = user11.equals((java.lang.Object) user28);
        java.lang.String str35 = user11.getUserId();
        com.iluwatar.converter.User user40 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean42 = user40.equals((java.lang.Object) 1.0d);
        boolean boolean44 = user40.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user49 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean51 = user49.equals((java.lang.Object) 10L);
        boolean boolean52 = user40.equals((java.lang.Object) user49);
        com.iluwatar.converter.User user57 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user62 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean64 = user62.equals((java.lang.Object) 1.0d);
        boolean boolean65 = user62.isActive();
        java.lang.Class<?> wildcardClass66 = user62.getClass();
        java.lang.String str67 = user62.getUserId();
        boolean boolean68 = user62.isActive();
        boolean boolean69 = user57.equals((java.lang.Object) user62);
        java.lang.String str70 = user57.getFirstName();
        boolean boolean71 = user40.equals((java.lang.Object) str70);
        java.lang.Class<?> wildcardClass72 = user40.getClass();
        boolean boolean73 = user11.equals((java.lang.Object) wildcardClass72);
        com.iluwatar.converter.User user78 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        boolean boolean79 = user11.equals((java.lang.Object) user78);
        boolean boolean80 = user4.equals((java.lang.Object) boolean79);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str21.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str22.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str33.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!" + "'", str67.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        com.iluwatar.converter.User user40 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str41 = user40.getFirstName();
        java.lang.Class<?> wildcardClass42 = user40.getClass();
        java.lang.Class<?> wildcardClass43 = user40.getClass();
        boolean boolean44 = user4.equals((java.lang.Object) wildcardClass43);
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
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str41.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean6 = user4.isActive();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean25 = user23.equals((java.lang.Object) 1.0d);
        boolean boolean26 = user23.isActive();
        java.lang.Class<?> wildcardClass27 = user23.getClass();
        boolean boolean28 = user23.isActive();
        boolean boolean29 = user23.isActive();
        boolean boolean30 = user23.isActive();
        boolean boolean31 = user23.isActive();
        java.lang.String str32 = user23.getFirstName();
        boolean boolean33 = user4.equals((java.lang.Object) user23);
        java.lang.String str34 = user4.getLastName();
        java.lang.String str35 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getLastName();
        java.lang.Object obj8 = null;
        boolean boolean9 = user4.equals(obj8);
        java.lang.String str10 = user4.getFirstName();
        java.lang.String str11 = user4.getUserId();
        java.lang.String str12 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str11.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str12.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", "User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        java.lang.Class<?> wildcardClass30 = user21.getClass();
        com.iluwatar.converter.User user35 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "", false, "hi!");
        java.lang.String str36 = user35.getUserId();
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean43 = user41.equals((java.lang.Object) 1.0d);
        java.lang.String str44 = user41.getUserId();
        java.lang.Class<?> wildcardClass45 = user41.getClass();
        boolean boolean46 = user35.equals((java.lang.Object) wildcardClass45);
        boolean boolean47 = user21.equals((java.lang.Object) user35);
        java.lang.Class<?> wildcardClass48 = user35.getClass();
        java.lang.String str49 = user35.getLastName();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        boolean boolean17 = user13.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        java.lang.String str12 = user4.getUserId();
        boolean boolean13 = user4.isActive();
        java.lang.String str14 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        boolean boolean11 = user4.isActive();
        boolean boolean12 = user4.isActive();
        com.iluwatar.converter.User user17 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "");
        boolean boolean18 = user4.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "");
        java.lang.String str5 = user4.toString();
        boolean boolean6 = user4.isActive();
        java.lang.String str7 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='hi!', lastName='', isActive=true, userId=''}" + "'", str5.equals("User{firstName='hi!', lastName='', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='hi!', lastName='', isActive=true, userId=''}" + "'", str7.equals("User{firstName='hi!', lastName='', isActive=true, userId=''}"));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.getFirstName();
        java.lang.String str11 = user4.toString();
        java.lang.Class<?> wildcardClass12 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str11.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.toString();
        java.lang.String str8 = user4.toString();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.toString();
        java.lang.String str11 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
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
        java.lang.Class<?> wildcardClass35 = user27.getClass();
        boolean boolean36 = user4.equals((java.lang.Object) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
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
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
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
        java.lang.String str65 = user21.toString();
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
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str65.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        java.lang.String str12 = user4.getUserId();
        boolean boolean13 = user4.isActive();
        com.iluwatar.converter.User user18 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "");
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str24 = user23.getFirstName();
        java.lang.Class<?> wildcardClass25 = user23.getClass();
        boolean boolean26 = user18.equals((java.lang.Object) wildcardClass25);
        boolean boolean27 = user4.equals((java.lang.Object) boolean26);
        java.lang.String str28 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str24.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean8 = user4.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        boolean boolean11 = user4.equals((java.lang.Object) 10L);
        boolean boolean12 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        com.iluwatar.converter.User user11 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        java.lang.Class<?> wildcardClass12 = user11.getClass();
        boolean boolean13 = user4.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
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
        java.lang.String str26 = user21.getLastName();
        java.lang.String str27 = user21.getFirstName();
        java.lang.Class<?> wildcardClass28 = user21.getClass();
        java.lang.String str29 = user21.getUserId();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getFirstName();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
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
        java.lang.String str30 = user4.toString();
        com.iluwatar.converter.User user35 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        boolean boolean36 = user4.equals((java.lang.Object) "");
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str30.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "User{firstName='hi!', lastName='', isActive=true, userId=''}", false, "");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.Object obj6 = null;
        boolean boolean7 = user4.equals(obj6);
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str10.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
        java.lang.String str5 = user4.getUserId();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='hi!', lastName='', isActive=true, userId=''}");
        boolean boolean11 = user4.equals((java.lang.Object) "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.getLastName();
        java.lang.String str8 = user4.getLastName();
        java.lang.String str9 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        com.iluwatar.converter.User user17 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        boolean boolean18 = user10.equals((java.lang.Object) false);
        java.lang.String str19 = user10.getUserId();
        com.iluwatar.converter.User user24 = new com.iluwatar.converter.User("User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", false, "");
        boolean boolean25 = user10.equals((java.lang.Object) user24);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str19.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean25 = user23.equals((java.lang.Object) 1.0d);
        boolean boolean26 = user23.isActive();
        java.lang.Class<?> wildcardClass27 = user23.getClass();
        boolean boolean28 = user23.isActive();
        boolean boolean29 = user23.isActive();
        boolean boolean30 = user23.isActive();
        boolean boolean31 = user23.isActive();
        java.lang.String str32 = user23.getFirstName();
        boolean boolean33 = user4.equals((java.lang.Object) user23);
        java.lang.String str34 = user23.getUserId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "");
        java.lang.String str5 = user4.getLastName();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        java.lang.Class<?> wildcardClass26 = user4.getClass();
        java.lang.String str27 = user4.toString();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str27.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='hi!', lastName='', isActive=true, userId=''}" + "'", str6.equals("User{firstName='hi!', lastName='', isActive=true, userId=''}"));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getLastName();
        java.lang.String str18 = user4.toString();
        java.lang.String str19 = user4.getUserId();
        java.lang.String str20 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str18.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        java.lang.String str14 = user10.getLastName();
        java.lang.String str15 = user10.toString();
        java.lang.String str16 = user10.getUserId();
        java.lang.Class<?> wildcardClass17 = user10.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str15.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str16.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean11 = user10.isActive();
        boolean boolean12 = user10.isActive();
        com.iluwatar.converter.User user17 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str18 = user17.getLastName();
        java.lang.String str19 = user17.getLastName();
        java.lang.String str20 = user17.getUserId();
        boolean boolean21 = user10.equals((java.lang.Object) str20);
        boolean boolean23 = user10.equals((java.lang.Object) (short) 10);
        com.iluwatar.converter.User user28 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean29 = user10.equals((java.lang.Object) true);
        java.lang.String str30 = user10.getFirstName();
        com.iluwatar.converter.User user35 = new com.iluwatar.converter.User("User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", false, "");
        boolean boolean36 = user10.equals((java.lang.Object) "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}");
        java.lang.String str37 = user10.getUserId();
        boolean boolean38 = user4.equals((java.lang.Object) str37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str20.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str30.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.getUserId();
        java.lang.String str11 = user4.toString();
        com.iluwatar.converter.User user16 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
        boolean boolean17 = user4.equals((java.lang.Object) "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
        java.lang.String str18 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str11.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "hi!");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.getUserId();
        java.lang.String str8 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getLastName();
        java.lang.String str18 = user4.toString();
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user28 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean30 = user28.equals((java.lang.Object) 1.0d);
        boolean boolean31 = user28.isActive();
        java.lang.Class<?> wildcardClass32 = user28.getClass();
        java.lang.String str33 = user28.getUserId();
        boolean boolean34 = user28.isActive();
        boolean boolean35 = user23.equals((java.lang.Object) user28);
        java.lang.String str36 = user23.getFirstName();
        java.lang.String str37 = user23.getFirstName();
        com.iluwatar.converter.User user42 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean44 = user42.equals((java.lang.Object) 1.0d);
        boolean boolean45 = user42.isActive();
        java.lang.Class<?> wildcardClass46 = user42.getClass();
        boolean boolean47 = user42.isActive();
        boolean boolean48 = user42.isActive();
        boolean boolean49 = user42.isActive();
        boolean boolean50 = user42.isActive();
        java.lang.String str51 = user42.getFirstName();
        boolean boolean52 = user23.equals((java.lang.Object) user42);
        java.lang.String str53 = user42.toString();
        boolean boolean54 = user4.equals((java.lang.Object) str53);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str18.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str53.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.toString();
        boolean boolean12 = user4.equals((java.lang.Object) 1.0f);
        java.lang.String str13 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", false, "User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}'}");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", false, "User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=false, userId='User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=false, userId='User{firstName='hi!', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        java.lang.String str17 = user13.getUserId();
        java.lang.String str18 = user13.getUserId();
        java.lang.String str19 = user13.getUserId();
        java.lang.String str20 = user13.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "hi!");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.toString();
        com.iluwatar.converter.User user11 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean13 = user11.equals((java.lang.Object) 1.0d);
        java.lang.String str14 = user11.toString();
        java.lang.String str15 = user11.toString();
        boolean boolean16 = user4.equals((java.lang.Object) user11);
        java.lang.String str17 = user11.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str15.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str17.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        boolean boolean17 = user4.isActive();
        java.lang.String str18 = user4.getUserId();
        java.lang.String str19 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
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
        java.lang.Class<?> wildcardClass35 = user27.getClass();
        boolean boolean36 = user4.equals((java.lang.Object) wildcardClass35);
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean43 = user41.equals((java.lang.Object) 1.0d);
        boolean boolean44 = user41.isActive();
        java.lang.Class<?> wildcardClass45 = user41.getClass();
        boolean boolean46 = user41.isActive();
        boolean boolean47 = user41.isActive();
        boolean boolean48 = user41.isActive();
        boolean boolean49 = user41.isActive();
        java.lang.String str50 = user41.getFirstName();
        java.lang.Object obj51 = null;
        boolean boolean52 = user41.equals(obj51);
        boolean boolean53 = user4.equals((java.lang.Object) user41);
        boolean boolean54 = user4.isActive();
        java.lang.Class<?> wildcardClass55 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
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
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
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
        java.lang.String str26 = user21.getLastName();
        java.lang.String str27 = user21.getUserId();
        com.iluwatar.converter.User user32 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean34 = user32.equals((java.lang.Object) 1.0d);
        boolean boolean36 = user32.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean43 = user41.equals((java.lang.Object) 10L);
        boolean boolean44 = user32.equals((java.lang.Object) user41);
        java.lang.String str45 = user41.getUserId();
        java.lang.String str46 = user41.getUserId();
        boolean boolean48 = user41.equals((java.lang.Object) 1);
        java.lang.String str49 = user41.getLastName();
        boolean boolean50 = user21.equals((java.lang.Object) str49);
        java.lang.Class<?> wildcardClass51 = user21.getClass();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}", true, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.toString();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='hi!', lastName='', isActive=true, userId=''}" + "'", str5.equals("User{firstName='hi!', lastName='', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='hi!', lastName='', isActive=true, userId=''}" + "'", str6.equals("User{firstName='hi!', lastName='', isActive=true, userId=''}"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}", "hi!", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        java.lang.String str7 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        boolean boolean18 = user9.equals((java.lang.Object) 1L);
        java.lang.String str19 = user9.getFirstName();
        com.iluwatar.converter.User user24 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        boolean boolean25 = user24.isActive();
        boolean boolean26 = user9.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "hi!");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        java.lang.Class<?> wildcardClass30 = user21.getClass();
        com.iluwatar.converter.User user35 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "", false, "hi!");
        java.lang.String str36 = user35.getUserId();
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean43 = user41.equals((java.lang.Object) 1.0d);
        java.lang.String str44 = user41.getUserId();
        java.lang.Class<?> wildcardClass45 = user41.getClass();
        boolean boolean46 = user35.equals((java.lang.Object) wildcardClass45);
        boolean boolean47 = user21.equals((java.lang.Object) user35);
        java.lang.String str48 = user21.getLastName();
        java.lang.String str49 = user21.getFirstName();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getLastName();
        com.iluwatar.converter.User user11 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str12 = user11.getLastName();
        java.lang.Class<?> wildcardClass13 = user11.getClass();
        com.iluwatar.converter.User user18 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean20 = user18.equals((java.lang.Object) 1.0d);
        boolean boolean21 = user18.isActive();
        java.lang.Class<?> wildcardClass22 = user18.getClass();
        boolean boolean23 = user18.isActive();
        boolean boolean24 = user18.isActive();
        java.lang.String str25 = user18.getUserId();
        boolean boolean26 = user18.isActive();
        java.lang.String str27 = user18.getFirstName();
        java.lang.String str28 = user18.toString();
        boolean boolean29 = user11.equals((java.lang.Object) user18);
        java.lang.String str30 = user18.toString();
        boolean boolean31 = user4.equals((java.lang.Object) user18);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str28.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str30.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        java.lang.String str28 = user21.toString();
        java.lang.String str29 = user21.getUserId();
        java.lang.String str30 = user21.getFirstName();
        boolean boolean31 = user21.isActive();
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str28.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='hi!', lastName='', isActive=true, userId=''}", "User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", true, "User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getFirstName();
        java.lang.String str7 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}" + "'", str7.equals("User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}"));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        java.lang.String str47 = user29.getLastName();
        java.lang.String str48 = user29.getUserId();
        java.lang.String str49 = user29.getUserId();
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
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
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
        com.iluwatar.converter.User user23 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean25 = user23.equals((java.lang.Object) 1.0d);
        boolean boolean26 = user23.isActive();
        java.lang.Class<?> wildcardClass27 = user23.getClass();
        boolean boolean28 = user23.isActive();
        boolean boolean29 = user23.isActive();
        boolean boolean30 = user23.isActive();
        boolean boolean31 = user23.isActive();
        java.lang.String str32 = user23.getFirstName();
        boolean boolean33 = user4.equals((java.lang.Object) user23);
        java.lang.String str34 = user23.toString();
        boolean boolean35 = user23.isActive();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str34.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        boolean boolean14 = user9.isActive();
        boolean boolean15 = user9.isActive();
        java.lang.String str16 = user9.getUserId();
        boolean boolean18 = user9.equals((java.lang.Object) 100.0d);
        boolean boolean19 = user4.equals((java.lang.Object) user9);
        java.lang.String str20 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.String str10 = user4.getUserId();
        java.lang.Class<?> wildcardClass11 = user4.getClass();
        java.lang.String str12 = user4.getLastName();
        java.lang.String str13 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
        com.iluwatar.converter.User user40 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean41 = user40.isActive();
        boolean boolean42 = user40.isActive();
        boolean boolean43 = user4.equals((java.lang.Object) user40);
        java.lang.String str44 = user40.getFirstName();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str44.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean5 = user4.isActive();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}", "hi!", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}'}"));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
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
        java.lang.String str31 = user21.getLastName();
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getLastName();
        boolean boolean7 = user4.isActive();
        java.lang.String str8 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
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
        java.lang.String str36 = user4.getFirstName();
        java.lang.String str37 = user4.getFirstName();
        java.lang.Class<?> wildcardClass38 = user4.getClass();
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
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.Class<?> wildcardClass17 = user4.getClass();
        java.lang.String str18 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", "hi!", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
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
        java.lang.String str30 = user21.getLastName();
        com.iluwatar.converter.User user35 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean37 = user35.equals((java.lang.Object) 1.0d);
        boolean boolean39 = user35.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user44 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean46 = user44.equals((java.lang.Object) 10L);
        boolean boolean47 = user35.equals((java.lang.Object) user44);
        boolean boolean48 = user35.isActive();
        boolean boolean49 = user21.equals((java.lang.Object) user35);
        java.lang.String str50 = user35.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.getUserId();
        boolean boolean7 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        java.lang.String str5 = user4.getFirstName();
        java.lang.String str6 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        java.lang.String str18 = user4.getLastName();
        java.lang.String str19 = user4.getLastName();
        java.lang.String str20 = user4.getUserId();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.String str5 = user4.getUserId();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean12 = user10.equals((java.lang.Object) 1.0d);
        java.lang.String str13 = user10.getLastName();
        java.lang.String str14 = user10.getUserId();
        com.iluwatar.converter.User user19 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean21 = user19.equals((java.lang.Object) 1.0d);
        boolean boolean23 = user19.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user28 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean30 = user28.equals((java.lang.Object) 10L);
        boolean boolean31 = user19.equals((java.lang.Object) user28);
        boolean boolean32 = user19.isActive();
        java.lang.String str33 = user19.getUserId();
        java.lang.String str34 = user19.toString();
        boolean boolean35 = user10.equals((java.lang.Object) user19);
        boolean boolean36 = user4.equals((java.lang.Object) user10);
        java.lang.String str37 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str34.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str37.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", false, "");
        java.lang.String str5 = user4.getUserId();
        java.lang.String str6 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId=''}" + "'", str6.equals("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId=''}"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        java.lang.String str35 = user29.getFirstName();
        boolean boolean36 = user29.isActive();
        boolean boolean37 = user29.isActive();
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
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean12 = user4.isActive();
        boolean boolean13 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", false, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
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
        boolean boolean35 = user4.isActive();
        java.lang.String str36 = user4.getFirstName();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str36.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        boolean boolean11 = user4.isActive();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.getFirstName();
        java.lang.Class<?> wildcardClass14 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
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
        com.iluwatar.converter.User user69 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean71 = user69.equals((java.lang.Object) 1.0d);
        boolean boolean73 = user69.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user78 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean80 = user78.equals((java.lang.Object) 10L);
        boolean boolean81 = user69.equals((java.lang.Object) user78);
        java.lang.String str82 = user78.getUserId();
        java.lang.String str83 = user78.getUserId();
        boolean boolean85 = user78.equals((java.lang.Object) 1);
        java.lang.String str86 = user78.getLastName();
        boolean boolean87 = user36.equals((java.lang.Object) user78);
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
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!" + "'", str82.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "hi!" + "'", str83.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "hi!" + "'", str86.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}", true, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.toString();
        java.lang.String str7 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        java.lang.String str6 = user4.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str6.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
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
        java.lang.Class<?> wildcardClass26 = user4.getClass();
        java.lang.String str27 = user4.getLastName();
        java.lang.Object obj28 = null;
        boolean boolean29 = user4.equals(obj28);
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
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.getUserId();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        com.iluwatar.converter.User user14 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        boolean boolean15 = user4.equals((java.lang.Object) "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        com.iluwatar.converter.User user20 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean22 = user20.equals((java.lang.Object) 1.0d);
        boolean boolean23 = user20.isActive();
        java.lang.Class<?> wildcardClass24 = user20.getClass();
        boolean boolean25 = user20.isActive();
        boolean boolean26 = user20.isActive();
        boolean boolean27 = user20.isActive();
        boolean boolean28 = user20.isActive();
        java.lang.String str29 = user20.getFirstName();
        java.lang.Object obj30 = null;
        boolean boolean31 = user20.equals(obj30);
        boolean boolean32 = user20.isActive();
        boolean boolean33 = user20.isActive();
        boolean boolean35 = user20.equals((java.lang.Object) 10.0f);
        java.lang.String str36 = user20.getUserId();
        java.lang.String str37 = user20.getUserId();
        boolean boolean38 = user4.equals((java.lang.Object) str37);
        java.lang.String str39 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getUserId();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.toString();
        boolean boolean11 = user4.isActive();
        java.lang.String str12 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str10.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str12.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
        java.lang.String str47 = user39.toString();
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
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str47.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        java.lang.String str26 = user21.getLastName();
        java.lang.String str27 = user21.getUserId();
        java.lang.String str28 = user21.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
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
        java.lang.String str28 = user21.toString();
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str28.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str29.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}'}", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId=''}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}", false, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        java.lang.String str14 = user10.getLastName();
        java.lang.Class<?> wildcardClass15 = user10.getClass();
        java.lang.String str16 = user10.getUserId();
        com.iluwatar.converter.User user21 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user26 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean28 = user26.equals((java.lang.Object) 1.0d);
        boolean boolean29 = user26.isActive();
        java.lang.Class<?> wildcardClass30 = user26.getClass();
        java.lang.String str31 = user26.getUserId();
        boolean boolean32 = user26.isActive();
        boolean boolean33 = user21.equals((java.lang.Object) user26);
        com.iluwatar.converter.User user38 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean40 = user38.equals((java.lang.Object) 1.0d);
        boolean boolean41 = user38.isActive();
        java.lang.Class<?> wildcardClass42 = user38.getClass();
        java.lang.String str43 = user38.getUserId();
        boolean boolean44 = user21.equals((java.lang.Object) user38);
        boolean boolean45 = user10.equals((java.lang.Object) user21);
        boolean boolean46 = user10.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str16.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='hi!', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str5.equals("User{firstName='hi!', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}'}"));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
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
        java.lang.String str35 = user29.getFirstName();
        boolean boolean36 = user29.isActive();
        java.lang.String str37 = user29.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass11 = user10.getClass();
        boolean boolean13 = user10.equals((java.lang.Object) (short) -1);
        com.iluwatar.converter.User user18 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str19 = user18.getLastName();
        java.lang.String str20 = user18.getUserId();
        boolean boolean21 = user10.equals((java.lang.Object) user18);
        com.iluwatar.converter.User user26 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str27 = user26.getLastName();
        java.lang.String str28 = user26.getUserId();
        boolean boolean29 = user26.isActive();
        boolean boolean30 = user18.equals((java.lang.Object) user26);
        java.lang.Class<?> wildcardClass31 = user26.getClass();
        boolean boolean32 = user4.equals((java.lang.Object) wildcardClass31);
        java.lang.String str33 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str33.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", false, "User{firstName='hi!', lastName='', isActive=true, userId=''}");
        boolean boolean5 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        java.lang.String str8 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}", true, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
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
        java.lang.String str21 = user9.toString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str21.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}");
        java.lang.String str5 = user4.toString();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
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
        java.lang.String str35 = user4.toString();
        java.lang.String str36 = user4.getLastName();
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
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}" + "'", str35.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
        java.lang.String str35 = user29.getFirstName();
        boolean boolean36 = user29.isActive();
        java.lang.String str37 = user29.toString();
        java.lang.String str38 = user29.toString();
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
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str37.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str38.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        java.lang.String str17 = user13.getUserId();
        java.lang.String str18 = user13.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
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
        java.lang.String str36 = user4.getFirstName();
        java.lang.String str37 = user4.toString();
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
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str37.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user18 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean20 = user18.equals((java.lang.Object) 1.0d);
        boolean boolean21 = user18.isActive();
        java.lang.Class<?> wildcardClass22 = user18.getClass();
        java.lang.String str23 = user18.getUserId();
        boolean boolean24 = user18.isActive();
        boolean boolean25 = user13.equals((java.lang.Object) user18);
        boolean boolean26 = user4.equals((java.lang.Object) boolean25);
        java.lang.String str27 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        java.lang.Class<?> wildcardClass12 = user4.getClass();
        java.lang.String str13 = user4.toString();
        java.lang.Class<?> wildcardClass14 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str13.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "", true, "");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getFirstName();
        java.lang.String str7 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='hi!', lastName='', isActive=true, userId=''}" + "'", str5.equals("User{firstName='hi!', lastName='', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='hi!', lastName='', isActive=true, userId=''}" + "'", str7.equals("User{firstName='hi!', lastName='', isActive=true, userId=''}"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        java.lang.String str26 = user21.getLastName();
        java.lang.String str27 = user21.getFirstName();
        java.lang.String str28 = user21.getFirstName();
        java.lang.String str29 = user21.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        java.lang.Class<?> wildcardClass30 = user21.getClass();
        com.iluwatar.converter.User user35 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "", false, "hi!");
        java.lang.String str36 = user35.getUserId();
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean43 = user41.equals((java.lang.Object) 1.0d);
        java.lang.String str44 = user41.getUserId();
        java.lang.Class<?> wildcardClass45 = user41.getClass();
        boolean boolean46 = user35.equals((java.lang.Object) wildcardClass45);
        boolean boolean47 = user21.equals((java.lang.Object) user35);
        java.lang.String str48 = user35.getLastName();
        boolean boolean49 = user35.isActive();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "", true, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        java.lang.String str6 = user4.getLastName();
        java.lang.String str7 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        com.iluwatar.converter.User user11 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str12 = user11.getLastName();
        java.lang.String str13 = user11.getLastName();
        java.lang.String str14 = user11.getUserId();
        boolean boolean15 = user4.equals((java.lang.Object) str14);
        java.lang.String str16 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str16.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
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
        boolean boolean21 = user9.isActive();
        java.lang.String str22 = user9.toString();
        com.iluwatar.converter.User user27 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean29 = user27.equals((java.lang.Object) 1.0d);
        boolean boolean30 = user27.isActive();
        java.lang.Class<?> wildcardClass31 = user27.getClass();
        boolean boolean32 = user27.isActive();
        boolean boolean33 = user27.isActive();
        java.lang.String str34 = user27.getUserId();
        boolean boolean36 = user27.equals((java.lang.Object) 100.0d);
        java.lang.String str37 = user27.getFirstName();
        java.lang.String str38 = user27.getFirstName();
        boolean boolean39 = user9.equals((java.lang.Object) str38);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str22.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        java.lang.String str17 = user13.getUserId();
        java.lang.String str18 = user13.getUserId();
        java.lang.String str19 = user13.getLastName();
        java.lang.String str20 = user13.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='hi!'}");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
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
        com.iluwatar.converter.User user20 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        java.lang.String str21 = user20.toString();
        boolean boolean22 = user4.equals((java.lang.Object) str21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User{firstName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}" + "'", str21.equals("User{firstName='User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}", true, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId=''}");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}", false, "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}");
        java.lang.String str5 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", false, "");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId=''}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId=''}"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}", false, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        java.lang.String str5 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
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
        boolean boolean21 = user9.isActive();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.getUserId();
        java.lang.Class<?> wildcardClass10 = user4.getClass();
        java.lang.String str11 = user4.getLastName();
        java.lang.Class<?> wildcardClass12 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.getLastName();
        boolean boolean8 = user4.isActive();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
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
        java.lang.Class<?> wildcardClass30 = user21.getClass();
        java.lang.String str31 = user21.getUserId();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.toString();
        java.lang.String str8 = user4.toString();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.getLastName();
        com.iluwatar.converter.User user15 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
        com.iluwatar.converter.User user20 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean22 = user20.equals((java.lang.Object) 1.0d);
        java.lang.String str23 = user20.getUserId();
        java.lang.Class<?> wildcardClass24 = user20.getClass();
        boolean boolean25 = user20.isActive();
        java.lang.String str26 = user20.toString();
        boolean boolean27 = user15.equals((java.lang.Object) str26);
        boolean boolean28 = user4.equals((java.lang.Object) str26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str26.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "");
        java.lang.String str5 = user4.toString();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId=''}" + "'", str5.equals("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
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
        java.lang.String str30 = user4.getLastName();
        boolean boolean31 = user4.isActive();
        java.lang.String str32 = user4.getLastName();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        boolean boolean10 = user4.isActive();
        java.lang.String str11 = user4.getUserId();
        boolean boolean13 = user4.equals((java.lang.Object) 100.0d);
        boolean boolean14 = user4.isActive();
        java.lang.String str15 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='hi!', lastName='', isActive=true, userId=''}'}", "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user10.toString();
        boolean boolean15 = user10.equals((java.lang.Object) "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        com.iluwatar.converter.User user20 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean21 = user20.isActive();
        boolean boolean22 = user20.isActive();
        com.iluwatar.converter.User user27 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str28 = user27.getLastName();
        java.lang.String str29 = user27.getLastName();
        java.lang.String str30 = user27.getUserId();
        boolean boolean31 = user20.equals((java.lang.Object) str30);
        boolean boolean33 = user20.equals((java.lang.Object) (short) 10);
        com.iluwatar.converter.User user38 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean39 = user20.equals((java.lang.Object) true);
        boolean boolean40 = user10.equals((java.lang.Object) true);
        java.lang.String str41 = user10.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str13.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str30.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str41.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        java.lang.String str7 = user4.toString();
        java.lang.String str8 = user4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str8.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.getFirstName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        boolean boolean7 = user4.isActive();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        boolean boolean9 = user4.isActive();
        java.lang.String str10 = user4.getFirstName();
        java.lang.String str11 = user4.toString();
        boolean boolean12 = user4.isActive();
        java.lang.String str13 = user4.getLastName();
        java.lang.Class<?> wildcardClass14 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}" + "'", str11.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}", false, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user14 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean16 = user14.equals((java.lang.Object) 1.0d);
        boolean boolean17 = user14.isActive();
        java.lang.Class<?> wildcardClass18 = user14.getClass();
        java.lang.String str19 = user14.getUserId();
        boolean boolean20 = user14.isActive();
        boolean boolean21 = user9.equals((java.lang.Object) user14);
        java.lang.String str22 = user9.toString();
        boolean boolean23 = user9.isActive();
        java.lang.String str24 = user9.getFirstName();
        boolean boolean25 = user4.equals((java.lang.Object) str24);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str22.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        boolean boolean8 = user4.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user13 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean15 = user13.equals((java.lang.Object) 10L);
        boolean boolean16 = user4.equals((java.lang.Object) user13);
        boolean boolean17 = user4.isActive();
        java.lang.String str18 = user4.getUserId();
        java.lang.String str19 = user4.toString();
        java.lang.String str20 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str19.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        boolean boolean6 = user4.equals((java.lang.Object) 0L);
        boolean boolean7 = user4.isActive();
        java.lang.String str8 = user4.getLastName();
        java.lang.String str9 = user4.getLastName();
        com.iluwatar.converter.User user14 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}");
        boolean boolean15 = user4.equals((java.lang.Object) "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId=''}", "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", true, "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        boolean boolean7 = user4.equals((java.lang.Object) (short) -1);
        com.iluwatar.converter.User user12 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str13 = user12.getLastName();
        java.lang.String str14 = user12.getUserId();
        boolean boolean15 = user4.equals((java.lang.Object) user12);
        com.iluwatar.converter.User user20 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "");
        java.lang.String str21 = user20.getLastName();
        java.lang.String str22 = user20.getUserId();
        boolean boolean23 = user20.isActive();
        boolean boolean24 = user12.equals((java.lang.Object) user20);
        com.iluwatar.converter.User user29 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId=''}", "", true, "User{firstName='', lastName='hi!', isActive=false, userId=''}");
        java.lang.Class<?> wildcardClass30 = user29.getClass();
        com.iluwatar.converter.User user35 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean37 = user35.equals((java.lang.Object) 1.0d);
        boolean boolean38 = user35.isActive();
        java.lang.Class<?> wildcardClass39 = user35.getClass();
        boolean boolean40 = user35.isActive();
        boolean boolean41 = user35.isActive();
        boolean boolean42 = user35.isActive();
        boolean boolean43 = user35.isActive();
        java.lang.String str44 = user35.getFirstName();
        java.lang.Object obj45 = null;
        boolean boolean46 = user35.equals(obj45);
        java.lang.String str47 = user35.getLastName();
        com.iluwatar.converter.User user52 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean54 = user52.equals((java.lang.Object) 1.0d);
        java.lang.String str55 = user52.toString();
        boolean boolean56 = user35.equals((java.lang.Object) user52);
        java.lang.String str57 = user52.getLastName();
        java.lang.String str58 = user52.getLastName();
        boolean boolean59 = user29.equals((java.lang.Object) user52);
        boolean boolean61 = user29.equals((java.lang.Object) 10);
        boolean boolean62 = user20.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str55.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        boolean boolean6 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}", "User{firstName='hi!', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        java.lang.String str12 = user9.getUserId();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        boolean boolean14 = user4.equals((java.lang.Object) wildcardClass13);
        com.iluwatar.converter.User user19 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user24 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean26 = user24.equals((java.lang.Object) 1.0d);
        boolean boolean27 = user24.isActive();
        java.lang.Class<?> wildcardClass28 = user24.getClass();
        java.lang.String str29 = user24.getUserId();
        boolean boolean30 = user24.isActive();
        boolean boolean31 = user19.equals((java.lang.Object) user24);
        com.iluwatar.converter.User user36 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean38 = user36.equals((java.lang.Object) 1.0d);
        boolean boolean39 = user36.isActive();
        java.lang.Class<?> wildcardClass40 = user36.getClass();
        java.lang.String str41 = user36.getUserId();
        boolean boolean42 = user19.equals((java.lang.Object) user36);
        java.lang.String str43 = user36.getLastName();
        java.lang.String str44 = user36.toString();
        java.lang.Class<?> wildcardClass45 = user36.getClass();
        com.iluwatar.converter.User user50 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "", false, "hi!");
        java.lang.String str51 = user50.getUserId();
        com.iluwatar.converter.User user56 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean58 = user56.equals((java.lang.Object) 1.0d);
        java.lang.String str59 = user56.getUserId();
        java.lang.Class<?> wildcardClass60 = user56.getClass();
        boolean boolean61 = user50.equals((java.lang.Object) wildcardClass60);
        boolean boolean62 = user36.equals((java.lang.Object) user50);
        java.lang.String str63 = user50.getLastName();
        boolean boolean64 = user4.equals((java.lang.Object) str63);
        com.iluwatar.converter.User user69 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean70 = user69.isActive();
        boolean boolean71 = user69.isActive();
        boolean boolean72 = user4.equals((java.lang.Object) boolean71);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str44.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.getUserId();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.String str9 = user4.toString();
        java.lang.String str10 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str9.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
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
        java.lang.Class<?> wildcardClass35 = user27.getClass();
        boolean boolean36 = user4.equals((java.lang.Object) wildcardClass35);
        com.iluwatar.converter.User user41 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean43 = user41.equals((java.lang.Object) 1.0d);
        boolean boolean44 = user41.isActive();
        java.lang.Class<?> wildcardClass45 = user41.getClass();
        boolean boolean46 = user41.isActive();
        boolean boolean47 = user41.isActive();
        boolean boolean48 = user41.isActive();
        boolean boolean49 = user41.isActive();
        java.lang.String str50 = user41.getFirstName();
        java.lang.Object obj51 = null;
        boolean boolean52 = user41.equals(obj51);
        boolean boolean53 = user4.equals((java.lang.Object) user41);
        boolean boolean54 = user41.isActive();
        com.iluwatar.converter.User user59 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        com.iluwatar.converter.User user64 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean66 = user64.equals((java.lang.Object) 1.0d);
        boolean boolean67 = user64.isActive();
        java.lang.Class<?> wildcardClass68 = user64.getClass();
        java.lang.String str69 = user64.toString();
        java.lang.String str70 = user64.toString();
        boolean boolean71 = user59.equals((java.lang.Object) str70);
        java.lang.String str72 = user59.toString();
        java.lang.String str73 = user59.toString();
        boolean boolean74 = user41.equals((java.lang.Object) str73);
        boolean boolean75 = user41.isActive();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
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
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str69.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str70.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}" + "'", str72.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}" + "'", str73.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str10 = user9.getFirstName();
        java.lang.Class<?> wildcardClass11 = user9.getClass();
        boolean boolean12 = user4.equals((java.lang.Object) wildcardClass11);
        java.lang.String str13 = user4.toString();
        java.lang.String str14 = user4.getLastName();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str10.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}" + "'", str13.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId=''}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId=''}"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId=''}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=true, userId=''}', isActive=true, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", true, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='hi!', lastName='', isActive=true, userId=''}'}");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
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
        java.lang.String str31 = user4.getUserId();
        java.lang.String str32 = user4.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean6 = user4.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = user4.getUserId();
        java.lang.Class<?> wildcardClass8 = user4.getClass();
        java.lang.Class<?> wildcardClass9 = user4.getClass();
        com.iluwatar.converter.User user14 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.Class<?> wildcardClass15 = user14.getClass();
        boolean boolean16 = user14.isActive();
        boolean boolean17 = user4.equals((java.lang.Object) boolean16);
        java.lang.String str18 = user4.getFirstName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}", false, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}");
        java.lang.String str5 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=true, userId=''}"));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", true, "");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.toString();
        java.lang.String str15 = user9.toString();
        boolean boolean16 = user4.equals((java.lang.Object) str15);
        java.lang.String str17 = user4.toString();
        com.iluwatar.converter.User user22 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user27 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean29 = user27.equals((java.lang.Object) 1.0d);
        boolean boolean30 = user27.isActive();
        java.lang.Class<?> wildcardClass31 = user27.getClass();
        java.lang.String str32 = user27.getUserId();
        boolean boolean33 = user27.isActive();
        boolean boolean34 = user22.equals((java.lang.Object) user27);
        java.lang.String str35 = user22.getFirstName();
        java.lang.String str36 = user22.getFirstName();
        java.lang.String str37 = user22.toString();
        boolean boolean38 = user4.equals((java.lang.Object) user22);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str15.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}" + "'", str17.equals("User{firstName='', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=true, userId=''}"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str37.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
        java.lang.String str35 = user27.toString();
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
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str35.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
        java.lang.String str30 = user21.getLastName();
        com.iluwatar.converter.User user35 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean37 = user35.equals((java.lang.Object) 1.0d);
        boolean boolean39 = user35.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user44 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean46 = user44.equals((java.lang.Object) 10L);
        boolean boolean47 = user35.equals((java.lang.Object) user44);
        boolean boolean48 = user35.isActive();
        boolean boolean49 = user21.equals((java.lang.Object) user35);
        java.lang.String str50 = user35.getUserId();
        java.lang.String str51 = user35.getUserId();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", false, "hi!");
        java.lang.String str5 = user4.getFirstName();
        boolean boolean6 = user4.isActive();
        java.lang.Class<?> wildcardClass7 = user4.getClass();
        java.lang.String str8 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str5.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
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
        boolean boolean22 = user9.isActive();
        java.lang.String str23 = user9.getLastName();
        java.lang.String str24 = user9.getFirstName();
        boolean boolean25 = user9.isActive();
        java.lang.Class<?> wildcardClass26 = user9.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}", false, "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}', isActive=false, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId=''}', lastName='', isActive=true, userId='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}'}'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
        java.lang.String str30 = user4.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        java.lang.String str6 = user4.getUserId();
        java.lang.String str7 = user4.getFirstName();
        boolean boolean8 = user4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str6.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("hi!", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId=''}", true, "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId=''}'}', lastName='User{firstName='', lastName='hi!', isActive=false, userId=''}', isActive=false, userId=''}");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId=''}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
        boolean boolean5 = user4.isActive();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user9 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean11 = user9.equals((java.lang.Object) 1.0d);
        boolean boolean12 = user9.isActive();
        java.lang.Class<?> wildcardClass13 = user9.getClass();
        java.lang.String str14 = user9.getUserId();
        boolean boolean15 = user9.isActive();
        boolean boolean16 = user4.equals((java.lang.Object) user9);
        java.lang.String str17 = user4.getUserId();
        java.lang.Class<?> wildcardClass18 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
        boolean boolean35 = user4.isActive();
        boolean boolean36 = user4.isActive();
        java.lang.String str37 = user4.getLastName();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
        java.lang.String str30 = user21.toString();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str30.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='hi!', isActive=false, userId='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}'}', isActive=false, userId='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}'}", "User{firstName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=false, userId='hi!'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=false, userId='hi!'}', lastName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId=''}");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
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
        boolean boolean37 = user21.isActive();
        com.iluwatar.converter.User user42 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user47 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean49 = user47.equals((java.lang.Object) 1.0d);
        boolean boolean50 = user47.isActive();
        java.lang.Class<?> wildcardClass51 = user47.getClass();
        java.lang.String str52 = user47.getUserId();
        boolean boolean53 = user47.isActive();
        boolean boolean54 = user42.equals((java.lang.Object) user47);
        com.iluwatar.converter.User user59 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean61 = user59.equals((java.lang.Object) 1.0d);
        boolean boolean62 = user59.isActive();
        java.lang.Class<?> wildcardClass63 = user59.getClass();
        java.lang.String str64 = user59.getUserId();
        boolean boolean65 = user42.equals((java.lang.Object) user59);
        java.lang.String str66 = user59.getFirstName();
        boolean boolean67 = user59.isActive();
        boolean boolean68 = user59.isActive();
        boolean boolean69 = user21.equals((java.lang.Object) boolean68);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
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
        java.lang.String str36 = user28.toString();
        java.lang.String str37 = user28.toString();
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
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str36.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}" + "'", str37.equals("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
        java.lang.Class<?> wildcardClass26 = user4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str24.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
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
        com.iluwatar.converter.User user54 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean56 = user54.equals((java.lang.Object) 1.0d);
        boolean boolean58 = user54.equals((java.lang.Object) 100.0d);
        com.iluwatar.converter.User user63 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        boolean boolean65 = user63.equals((java.lang.Object) 10L);
        boolean boolean66 = user54.equals((java.lang.Object) user63);
        java.lang.String str67 = user63.getLastName();
        boolean boolean68 = user4.equals((java.lang.Object) user63);
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!" + "'", str67.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str5 = user4.getLastName();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        java.lang.String str7 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str5.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str7.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "hi!", true, "hi!");
        java.lang.String str5 = user4.getLastName();
        com.iluwatar.converter.User user10 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", "hi!", false, "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}");
        java.lang.String str11 = user10.getLastName();
        boolean boolean12 = user4.equals((java.lang.Object) user10);
        java.lang.String str13 = user4.getFirstName();
        java.lang.String str14 = user4.getFirstName();
        com.iluwatar.converter.User user19 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        com.iluwatar.converter.User user24 = new com.iluwatar.converter.User("", "hi!", false, "hi!");
        boolean boolean26 = user24.equals((java.lang.Object) 1.0d);
        boolean boolean27 = user24.isActive();
        java.lang.Class<?> wildcardClass28 = user24.getClass();
        java.lang.String str29 = user24.getUserId();
        boolean boolean30 = user24.isActive();
        boolean boolean31 = user19.equals((java.lang.Object) user24);
        boolean boolean33 = user24.equals((java.lang.Object) 1L);
        com.iluwatar.converter.User user38 = new com.iluwatar.converter.User("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}", "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}");
        java.lang.String str39 = user38.getUserId();
        java.lang.String str40 = user38.getLastName();
        java.lang.String str41 = user38.getLastName();
        java.lang.String str42 = user38.getUserId();
        boolean boolean43 = user24.equals((java.lang.Object) str42);
        boolean boolean44 = user24.isActive();
        com.iluwatar.converter.User user49 = new com.iluwatar.converter.User("User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}", "hi!", false, "hi!");
        boolean boolean50 = user24.equals((java.lang.Object) "hi!");
        java.lang.String str51 = user24.getFirstName();
        java.lang.String str52 = user24.toString();
        boolean boolean53 = user4.equals((java.lang.Object) user24);
        java.lang.String str54 = user4.getUserId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str13.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str14.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str39.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str40.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str41.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "User{firstName='', lastName='hi!', isActive=true, userId='hi!'}" + "'", str42.equals("User{firstName='', lastName='hi!', isActive=true, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "User{firstName='', lastName='hi!', isActive=false, userId='hi!'}" + "'", str52.equals("User{firstName='', lastName='hi!', isActive=false, userId='hi!'}"));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", true, "User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.iluwatar.converter.User user4 = new com.iluwatar.converter.User("", "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}", false, "User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}");
        java.lang.String str5 = user4.toString();
        java.lang.Class<?> wildcardClass6 = user4.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}" + "'", str5.equals("User{firstName='', lastName='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}', isActive=false, userId='User{firstName='', lastName='User{firstName='User{firstName='', lastName='hi!', isActive=true, userId='hi!'}', lastName='hi!', isActive=true, userId='hi!'}', isActive=false, userId='hi!'}'}"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

