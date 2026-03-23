public abstract class Document {

    public abstract int getId();
    public abstract String getCreationDate();
    public abstract String getContent();
    public abstract String getContent(User user);

    @Override
    public abstract boolean equals(Object o);
}
