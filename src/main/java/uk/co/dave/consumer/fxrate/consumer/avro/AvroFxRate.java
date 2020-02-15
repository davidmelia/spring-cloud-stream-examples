/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package uk.co.dave.consumer.fxrate.consumer.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class AvroFxRate extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2115957863964451711L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroFxRate\",\"namespace\":\"uk.co.dave.consumer.fxrate.consumer.avro\",\"fields\":[{\"name\":\"from\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"to\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"rate\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":7,\"scale\":6}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<AvroFxRate> ENCODER =
      new BinaryMessageEncoder<AvroFxRate>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroFxRate> DECODER =
      new BinaryMessageDecoder<AvroFxRate>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AvroFxRate> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AvroFxRate> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AvroFxRate> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroFxRate>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AvroFxRate to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AvroFxRate from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AvroFxRate instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AvroFxRate fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String from;
  @Deprecated public java.lang.String to;
  @Deprecated public java.math.BigDecimal rate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroFxRate() {}

  /**
   * All-args constructor.
   * @param from The new value for from
   * @param to The new value for to
   * @param rate The new value for rate
   */
  public AvroFxRate(java.lang.String from, java.lang.String to, java.math.BigDecimal rate) {
    this.from = from;
    this.to = to;
    this.rate = rate;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return from;
    case 1: return to;
    case 2: return rate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      new org.apache.avro.Conversions.DecimalConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: from = value$ != null ? value$.toString() : null; break;
    case 1: to = value$ != null ? value$.toString() : null; break;
    case 2: rate = (java.math.BigDecimal)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'from' field.
   * @return The value of the 'from' field.
   */
  public java.lang.String getFrom() {
    return from;
  }


  /**
   * Sets the value of the 'from' field.
   * @param value the value to set.
   */
  public void setFrom(java.lang.String value) {
    this.from = value;
  }

  /**
   * Gets the value of the 'to' field.
   * @return The value of the 'to' field.
   */
  public java.lang.String getTo() {
    return to;
  }


  /**
   * Sets the value of the 'to' field.
   * @param value the value to set.
   */
  public void setTo(java.lang.String value) {
    this.to = value;
  }

  /**
   * Gets the value of the 'rate' field.
   * @return The value of the 'rate' field.
   */
  public java.math.BigDecimal getRate() {
    return rate;
  }


  /**
   * Sets the value of the 'rate' field.
   * @param value the value to set.
   */
  public void setRate(java.math.BigDecimal value) {
    this.rate = value;
  }

  /**
   * Creates a new AvroFxRate RecordBuilder.
   * @return A new AvroFxRate RecordBuilder
   */
  public static uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder newBuilder() {
    return new uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder();
  }

  /**
   * Creates a new AvroFxRate RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroFxRate RecordBuilder
   */
  public static uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder newBuilder(uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder other) {
    if (other == null) {
      return new uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder();
    } else {
      return new uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder(other);
    }
  }

  /**
   * Creates a new AvroFxRate RecordBuilder by copying an existing AvroFxRate instance.
   * @param other The existing instance to copy.
   * @return A new AvroFxRate RecordBuilder
   */
  public static uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder newBuilder(uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate other) {
    if (other == null) {
      return new uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder();
    } else {
      return new uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder(other);
    }
  }

  /**
   * RecordBuilder for AvroFxRate instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroFxRate>
    implements org.apache.avro.data.RecordBuilder<AvroFxRate> {

    private java.lang.String from;
    private java.lang.String to;
    private java.math.BigDecimal rate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.from)) {
        this.from = data().deepCopy(fields()[0].schema(), other.from);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.to)) {
        this.to = data().deepCopy(fields()[1].schema(), other.to);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.rate)) {
        this.rate = data().deepCopy(fields()[2].schema(), other.rate);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing AvroFxRate instance
     * @param other The existing instance to copy.
     */
    private Builder(uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.from)) {
        this.from = data().deepCopy(fields()[0].schema(), other.from);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.to)) {
        this.to = data().deepCopy(fields()[1].schema(), other.to);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rate)) {
        this.rate = data().deepCopy(fields()[2].schema(), other.rate);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'from' field.
      * @return The value.
      */
    public java.lang.String getFrom() {
      return from;
    }


    /**
      * Sets the value of the 'from' field.
      * @param value The value of 'from'.
      * @return This builder.
      */
    public uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder setFrom(java.lang.String value) {
      validate(fields()[0], value);
      this.from = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'from' field has been set.
      * @return True if the 'from' field has been set, false otherwise.
      */
    public boolean hasFrom() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'from' field.
      * @return This builder.
      */
    public uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder clearFrom() {
      from = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'to' field.
      * @return The value.
      */
    public java.lang.String getTo() {
      return to;
    }


    /**
      * Sets the value of the 'to' field.
      * @param value The value of 'to'.
      * @return This builder.
      */
    public uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder setTo(java.lang.String value) {
      validate(fields()[1], value);
      this.to = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'to' field has been set.
      * @return True if the 'to' field has been set, false otherwise.
      */
    public boolean hasTo() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'to' field.
      * @return This builder.
      */
    public uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder clearTo() {
      to = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'rate' field.
      * @return The value.
      */
    public java.math.BigDecimal getRate() {
      return rate;
    }


    /**
      * Sets the value of the 'rate' field.
      * @param value The value of 'rate'.
      * @return This builder.
      */
    public uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder setRate(java.math.BigDecimal value) {
      validate(fields()[2], value);
      this.rate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'rate' field has been set.
      * @return True if the 'rate' field has been set, false otherwise.
      */
    public boolean hasRate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'rate' field.
      * @return This builder.
      */
    public uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRate.Builder clearRate() {
      rate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroFxRate build() {
      try {
        AvroFxRate record = new AvroFxRate();
        record.from = fieldSetFlags()[0] ? this.from : (java.lang.String) defaultValue(fields()[0]);
        record.to = fieldSetFlags()[1] ? this.to : (java.lang.String) defaultValue(fields()[1]);
        record.rate = fieldSetFlags()[2] ? this.rate : (java.math.BigDecimal) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroFxRate>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroFxRate>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroFxRate>
    READER$ = (org.apache.avro.io.DatumReader<AvroFxRate>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










