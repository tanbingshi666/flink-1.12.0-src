/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.flink.formats.avro.generated;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class SchemaRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9089075648574984345L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SchemaRecord\",\"namespace\":\"org.apache.flink.formats.avro.generated\",\"fields\":[{\"name\":\"field1\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"field2\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"time1\",\"type\":\"long\"},{\"name\":\"time2\",\"type\":\"long\"},{\"name\":\"field3\",\"type\":[\"null\",\"double\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SchemaRecord> ENCODER =
      new BinaryMessageEncoder<SchemaRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SchemaRecord> DECODER =
      new BinaryMessageDecoder<SchemaRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SchemaRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SchemaRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SchemaRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SchemaRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SchemaRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SchemaRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SchemaRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SchemaRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.Long field1;
   private java.lang.CharSequence field2;
   private long time1;
   private long time2;
   private java.lang.Double field3;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SchemaRecord() {}

  /**
   * All-args constructor.
   * @param field1 The new value for field1
   * @param field2 The new value for field2
   * @param time1 The new value for time1
   * @param time2 The new value for time2
   * @param field3 The new value for field3
   */
  public SchemaRecord(java.lang.Long field1, java.lang.CharSequence field2, java.lang.Long time1, java.lang.Long time2, java.lang.Double field3) {
    this.field1 = field1;
    this.field2 = field2;
    this.time1 = time1;
    this.time2 = time2;
    this.field3 = field3;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return field1;
    case 1: return field2;
    case 2: return time1;
    case 3: return time2;
    case 4: return field3;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: field1 = (java.lang.Long)value$; break;
    case 1: field2 = (java.lang.CharSequence)value$; break;
    case 2: time1 = (java.lang.Long)value$; break;
    case 3: time2 = (java.lang.Long)value$; break;
    case 4: field3 = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'field1' field.
   * @return The value of the 'field1' field.
   */
  public java.lang.Long getField1() {
    return field1;
  }


  /**
   * Sets the value of the 'field1' field.
   * @param value the value to set.
   */
  public void setField1(java.lang.Long value) {
    this.field1 = value;
  }

  /**
   * Gets the value of the 'field2' field.
   * @return The value of the 'field2' field.
   */
  public java.lang.CharSequence getField2() {
    return field2;
  }


  /**
   * Sets the value of the 'field2' field.
   * @param value the value to set.
   */
  public void setField2(java.lang.CharSequence value) {
    this.field2 = value;
  }

  /**
   * Gets the value of the 'time1' field.
   * @return The value of the 'time1' field.
   */
  public long getTime1() {
    return time1;
  }


  /**
   * Sets the value of the 'time1' field.
   * @param value the value to set.
   */
  public void setTime1(long value) {
    this.time1 = value;
  }

  /**
   * Gets the value of the 'time2' field.
   * @return The value of the 'time2' field.
   */
  public long getTime2() {
    return time2;
  }


  /**
   * Sets the value of the 'time2' field.
   * @param value the value to set.
   */
  public void setTime2(long value) {
    this.time2 = value;
  }

  /**
   * Gets the value of the 'field3' field.
   * @return The value of the 'field3' field.
   */
  public java.lang.Double getField3() {
    return field3;
  }


  /**
   * Sets the value of the 'field3' field.
   * @param value the value to set.
   */
  public void setField3(java.lang.Double value) {
    this.field3 = value;
  }

  /**
   * Creates a new SchemaRecord RecordBuilder.
   * @return A new SchemaRecord RecordBuilder
   */
  public static org.apache.flink.formats.avro.generated.SchemaRecord.Builder newBuilder() {
    return new org.apache.flink.formats.avro.generated.SchemaRecord.Builder();
  }

  /**
   * Creates a new SchemaRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SchemaRecord RecordBuilder
   */
  public static org.apache.flink.formats.avro.generated.SchemaRecord.Builder newBuilder(org.apache.flink.formats.avro.generated.SchemaRecord.Builder other) {
    if (other == null) {
      return new org.apache.flink.formats.avro.generated.SchemaRecord.Builder();
    } else {
      return new org.apache.flink.formats.avro.generated.SchemaRecord.Builder(other);
    }
  }

  /**
   * Creates a new SchemaRecord RecordBuilder by copying an existing SchemaRecord instance.
   * @param other The existing instance to copy.
   * @return A new SchemaRecord RecordBuilder
   */
  public static org.apache.flink.formats.avro.generated.SchemaRecord.Builder newBuilder(org.apache.flink.formats.avro.generated.SchemaRecord other) {
    if (other == null) {
      return new org.apache.flink.formats.avro.generated.SchemaRecord.Builder();
    } else {
      return new org.apache.flink.formats.avro.generated.SchemaRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for SchemaRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SchemaRecord>
    implements org.apache.avro.data.RecordBuilder<SchemaRecord> {

    private java.lang.Long field1;
    private java.lang.CharSequence field2;
    private long time1;
    private long time2;
    private java.lang.Double field3;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.flink.formats.avro.generated.SchemaRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.field1)) {
        this.field1 = data().deepCopy(fields()[0].schema(), other.field1);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.field2)) {
        this.field2 = data().deepCopy(fields()[1].schema(), other.field2);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.time1)) {
        this.time1 = data().deepCopy(fields()[2].schema(), other.time1);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.time2)) {
        this.time2 = data().deepCopy(fields()[3].schema(), other.time2);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.field3)) {
        this.field3 = data().deepCopy(fields()[4].schema(), other.field3);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing SchemaRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.flink.formats.avro.generated.SchemaRecord other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.field1)) {
        this.field1 = data().deepCopy(fields()[0].schema(), other.field1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.field2)) {
        this.field2 = data().deepCopy(fields()[1].schema(), other.field2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.time1)) {
        this.time1 = data().deepCopy(fields()[2].schema(), other.time1);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.time2)) {
        this.time2 = data().deepCopy(fields()[3].schema(), other.time2);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.field3)) {
        this.field3 = data().deepCopy(fields()[4].schema(), other.field3);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'field1' field.
      * @return The value.
      */
    public java.lang.Long getField1() {
      return field1;
    }


    /**
      * Sets the value of the 'field1' field.
      * @param value The value of 'field1'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SchemaRecord.Builder setField1(java.lang.Long value) {
      validate(fields()[0], value);
      this.field1 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'field1' field has been set.
      * @return True if the 'field1' field has been set, false otherwise.
      */
    public boolean hasField1() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'field1' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SchemaRecord.Builder clearField1() {
      field1 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'field2' field.
      * @return The value.
      */
    public java.lang.CharSequence getField2() {
      return field2;
    }


    /**
      * Sets the value of the 'field2' field.
      * @param value The value of 'field2'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SchemaRecord.Builder setField2(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.field2 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'field2' field has been set.
      * @return True if the 'field2' field has been set, false otherwise.
      */
    public boolean hasField2() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'field2' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SchemaRecord.Builder clearField2() {
      field2 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'time1' field.
      * @return The value.
      */
    public long getTime1() {
      return time1;
    }


    /**
      * Sets the value of the 'time1' field.
      * @param value The value of 'time1'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SchemaRecord.Builder setTime1(long value) {
      validate(fields()[2], value);
      this.time1 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'time1' field has been set.
      * @return True if the 'time1' field has been set, false otherwise.
      */
    public boolean hasTime1() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'time1' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SchemaRecord.Builder clearTime1() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'time2' field.
      * @return The value.
      */
    public long getTime2() {
      return time2;
    }


    /**
      * Sets the value of the 'time2' field.
      * @param value The value of 'time2'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SchemaRecord.Builder setTime2(long value) {
      validate(fields()[3], value);
      this.time2 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'time2' field has been set.
      * @return True if the 'time2' field has been set, false otherwise.
      */
    public boolean hasTime2() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'time2' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SchemaRecord.Builder clearTime2() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'field3' field.
      * @return The value.
      */
    public java.lang.Double getField3() {
      return field3;
    }


    /**
      * Sets the value of the 'field3' field.
      * @param value The value of 'field3'.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SchemaRecord.Builder setField3(java.lang.Double value) {
      validate(fields()[4], value);
      this.field3 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'field3' field has been set.
      * @return True if the 'field3' field has been set, false otherwise.
      */
    public boolean hasField3() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'field3' field.
      * @return This builder.
      */
    public org.apache.flink.formats.avro.generated.SchemaRecord.Builder clearField3() {
      field3 = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SchemaRecord build() {
      try {
        SchemaRecord record = new SchemaRecord();
        record.field1 = fieldSetFlags()[0] ? this.field1 : (java.lang.Long) defaultValue(fields()[0]);
        record.field2 = fieldSetFlags()[1] ? this.field2 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.time1 = fieldSetFlags()[2] ? this.time1 : (java.lang.Long) defaultValue(fields()[2]);
        record.time2 = fieldSetFlags()[3] ? this.time2 : (java.lang.Long) defaultValue(fields()[3]);
        record.field3 = fieldSetFlags()[4] ? this.field3 : (java.lang.Double) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SchemaRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<SchemaRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SchemaRecord>
    READER$ = (org.apache.avro.io.DatumReader<SchemaRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.field1 == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.field1);
    }

    if (this.field2 == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.field2);
    }

    out.writeLong(this.time1);

    out.writeLong(this.time2);

    if (this.field3 == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeDouble(this.field3);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.field1 = null;
      } else {
        this.field1 = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.field2 = null;
      } else {
        this.field2 = in.readString(this.field2 instanceof Utf8 ? (Utf8)this.field2 : null);
      }

      this.time1 = in.readLong();

      this.time2 = in.readLong();

      if (in.readIndex() != 1) {
        in.readNull();
        this.field3 = null;
      } else {
        this.field3 = in.readDouble();
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.field1 = null;
          } else {
            this.field1 = in.readLong();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.field2 = null;
          } else {
            this.field2 = in.readString(this.field2 instanceof Utf8 ? (Utf8)this.field2 : null);
          }
          break;

        case 2:
          this.time1 = in.readLong();
          break;

        case 3:
          this.time2 = in.readLong();
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.field3 = null;
          } else {
            this.field3 = in.readDouble();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










