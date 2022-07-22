package com.adda52.learning.serializationAndDeserialization;

import java.io.*;

public class readResolveSerialization implements Serializable {
        private static final long serialVersionUID = 1L;

        public static final readResolveSerialization INSTANCE = new readResolveSerialization();

        private readResolveSerialization() {
            if (INSTANCE != null)
                throw new RuntimeException("Singleton instance already exists!");
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public void leaveTheBuilding() {
            System.out.println("SingletonWithPublicFinalField.leaveTheBuilding() called...");
        }

        public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
            readResolveSerialization instance = readResolveSerialization.INSTANCE;

            System.out.println("Before serialization: " + instance);

            //serializing
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file1.ser"))) {
                out.writeObject(instance);
            }

            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("file1.ser"))) {
                readResolveSerialization object= (readResolveSerialization) in.readObject();
                System.out.println("After deserialization: " + object);
            }
        }
}
