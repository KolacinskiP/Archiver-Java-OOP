package main;

/**
 * Stores properties of files to be performed operation on
 */
public class FileProperties {
    private String name;
    private long size;
    private long compressedSize;
    private int compressionMethod;

    public FileProperties(String name, long size, long compressedSize, int compressionMethod) {
        setName(name);
        setSize(size);
        setCompressedSize(compressedSize);
        setCompressionMethod(compressionMethod);
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public long getCompressedSize() {
        return compressedSize;
    }

    public int getCompressionMethod() {
        return compressionMethod;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSize(long size){
        this.size = size;
    }

    public void setCompressedSize(long compressedSize){
        this.compressedSize = compressedSize;
    }

    public void setCompressionMethod(int compressionMethod){
        this.compressionMethod = compressionMethod;
    }

    /**
     * Calculates the compression ratio
     * @return compression ratio
     */
    public long getCompressionRatio() {
        return 100 - ((getCompressedSize() * 100) / getSize());
    }

    /**
     * Makes a string of file's properties
     * @return string of file's properties
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getName());
        if (getSize() > 0) {
            builder.append("\t");
            builder.append(getSize() / 1024);
            builder.append(" KB (");
            builder.append(getCompressedSize() / 1024);
            builder.append(" KB) compression: ");
            builder.append(getCompressionRatio());
            builder.append("%");
        }

        return builder.toString();
    }
}