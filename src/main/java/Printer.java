public class Printer {
    public static void main(String[] args) {
        String name1, name2, name3, name4, name5, name6, name7, name8;
        int phone1, phone2, phone3, phone4, phone5, phone6, phone7, phone8;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            name3 = "Zjukova";
            name4 = "Senchilo";
            name5 = "Zabybenec";
            name6 = "Grigoriev";
            name7 = "Krasnoperov";
            name8 = "Bobrov";

            phone1 = 111321;
            phone2 = 112321;
            phone3 = 113321;
            phone4 = 114321;
            phone5 = 115321;
            phone6 = 116321;
            phone7 = 117321;
            phone8 = 118321;

        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            name4 = args[3];
            name5 = args[4];
            name6 = args[5];
            name7 = args[6];
            name8 = args[7];

            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
            phone3 = Integer.parseInt(args[4]);
            phone4 = Integer.parseInt(args[5]);
            phone5 = Integer.parseInt(args[6]);
            phone6 = Integer.parseInt(args[7]);
            phone7 = Integer.parseInt(args[8]);
            phone8 = Integer.parseInt(args[9]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name2, phone3);
        myPhoneBook.add(name3, phone4);
        myPhoneBook.add(name3, phone5);
        myPhoneBook.add(name4, phone4);
        myPhoneBook.add(name5, phone4);
        myPhoneBook.add(name5, phone6);
        myPhoneBook.add(name5, phone7);
        myPhoneBook.add(name6, phone8);
        myPhoneBook.add(name7, phone1);
        myPhoneBook.add(name8, phone4);

        System.out.println("PhoneNumbers for " + name1 +": " + myPhoneBook.find(name1));
        System.out.println();
        PhoneBook.getPhoneBook();
        System.out.println();
        System.out.println("PhoneNumbers for " + "Me" + ": "+ myPhoneBook.find("Me"));
    }

}