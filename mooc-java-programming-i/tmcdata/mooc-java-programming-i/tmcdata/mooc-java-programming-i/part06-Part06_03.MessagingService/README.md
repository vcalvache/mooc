The exercise template comes with a pre-defined Message class that can be used to create objects representing messages. Each message has a sender and some content.

Implement the MessagingService class. The class must have a parameterless constructor and contain a list of Message objects. After that, add the following two methods to the class:

    * public void add(Message message) - adds a message passed as a parameter to the messaging service as long as the message content is at most 280 characters long.
    * public ArrayList<Message> getMessages() - returns the messages added to the messaging service.

Tip! You can find out the length of the string using the length() method associated with the string.