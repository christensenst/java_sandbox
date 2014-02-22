package java_sandbox.input_output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * This program demonstrates serialization of a Bank object.  If a file with
 * serialized data exists, then it is loaded.  Otherwise, the program starts
 * with a new Bank.  Bank accounts are added to the bank.  Then the bank
 * object is saved.
 * @author christensenst
 */
public class SerialDemo
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Bank firstBank;
        File f = new File("bank.dat");
        if (f.exists())
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
            firstBank = (Bank) in.readObject();
            in.close();
        }
        else
        {
            firstBank = new Bank();
            firstBank.addAccount(new BankAccount(101, 8000));
            firstBank.addAccount(new BankAccount(102, 5000));
        }
        
        //Deposit some money
        BankAccount a = firstBank.find(101);
        a.deposit(100);
        System.out.println(a.getAccountNumber() + ":" + a.getBalance());
        a = firstBank.find(102);
        System.out.println(a.getAccountNumber() + ":" + a.getBalance());
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(firstBank);
        out.close();
    }
}
