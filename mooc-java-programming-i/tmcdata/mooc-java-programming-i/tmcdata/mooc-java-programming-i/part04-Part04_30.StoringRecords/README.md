In this exercise, we'll be working with files stored in CSV format, which contain names and ages separated by commas. The file format may look like this:

    Sample data
        lily,3
        anton,5
        levi,4
        amy,1

The exercise template already has a Person class, and the class StoringRecords has a body for the method public static ArrayList<Person> readRecordsFromFile(String file). Implement the readRecordsFromFile method such that it reads the persons from the file passed as a parameter, and finally returns them in the list returned by the method.

The exercise template has a main method that you can use to test how your program works. In this exercise, only modify the method readRecordsFromFile.