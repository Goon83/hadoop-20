/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.corona;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceRequest implements org.apache.thrift.TBase<ResourceRequest, ResourceRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResourceRequest");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField HOSTS_FIELD_DESC = new org.apache.thrift.protocol.TField("hosts", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SPECS_FIELD_DESC = new org.apache.thrift.protocol.TField("specs", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField EXCLUDE_HOSTS_FIELD_DESC = new org.apache.thrift.protocol.TField("excludeHosts", org.apache.thrift.protocol.TType.LIST, (short)5);

  public int id; // required
  public List<String> hosts; // required
  public ComputeSpecs specs; // required
  public String type; // required
  public List<String> excludeHosts; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    HOSTS((short)2, "hosts"),
    SPECS((short)3, "specs"),
    TYPE((short)4, "type"),
    EXCLUDE_HOSTS((short)5, "excludeHosts");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // HOSTS
          return HOSTS;
        case 3: // SPECS
          return SPECS;
        case 4: // TYPE
          return TYPE;
        case 5: // EXCLUDE_HOSTS
          return EXCLUDE_HOSTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "ResourceRequestId")));
    tmpMap.put(_Fields.HOSTS, new org.apache.thrift.meta_data.FieldMetaData("hosts", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SPECS, new org.apache.thrift.meta_data.FieldMetaData("specs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ComputeSpecs.class)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXCLUDE_HOSTS, new org.apache.thrift.meta_data.FieldMetaData("excludeHosts", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResourceRequest.class, metaDataMap);
  }

  public ResourceRequest() {
  }

  public ResourceRequest(
    int id,
    String type)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResourceRequest(ResourceRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.id = other.id;
    if (other.isSetHosts()) {
      List<String> __this__hosts = new ArrayList<String>();
      for (String other_element : other.hosts) {
        __this__hosts.add(other_element);
      }
      this.hosts = __this__hosts;
    }
    if (other.isSetSpecs()) {
      this.specs = new ComputeSpecs(other.specs);
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetExcludeHosts()) {
      List<String> __this__excludeHosts = new ArrayList<String>();
      for (String other_element : other.excludeHosts) {
        __this__excludeHosts.add(other_element);
      }
      this.excludeHosts = __this__excludeHosts;
    }
  }

  public ResourceRequest deepCopy() {
    return new ResourceRequest(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.hosts = null;
    this.specs = null;
    this.type = null;
    this.excludeHosts = null;
  }

  public int getId() {
    return this.id;
  }

  public ResourceRequest setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bit_vector.clear(__ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return __isset_bit_vector.get(__ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bit_vector.set(__ID_ISSET_ID, value);
  }

  public int getHostsSize() {
    return (this.hosts == null) ? 0 : this.hosts.size();
  }

  public java.util.Iterator<String> getHostsIterator() {
    return (this.hosts == null) ? null : this.hosts.iterator();
  }

  public void addToHosts(String elem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<String>();
    }
    this.hosts.add(elem);
  }

  public List<String> getHosts() {
    return this.hosts;
  }

  public ResourceRequest setHosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public void unsetHosts() {
    this.hosts = null;
  }

  /** Returns true if field hosts is set (has been assigned a value) and false otherwise */
  public boolean isSetHosts() {
    return this.hosts != null;
  }

  public void setHostsIsSet(boolean value) {
    if (!value) {
      this.hosts = null;
    }
  }

  public ComputeSpecs getSpecs() {
    return this.specs;
  }

  public ResourceRequest setSpecs(ComputeSpecs specs) {
    this.specs = specs;
    return this;
  }

  public void unsetSpecs() {
    this.specs = null;
  }

  /** Returns true if field specs is set (has been assigned a value) and false otherwise */
  public boolean isSetSpecs() {
    return this.specs != null;
  }

  public void setSpecsIsSet(boolean value) {
    if (!value) {
      this.specs = null;
    }
  }

  public String getType() {
    return this.type;
  }

  public ResourceRequest setType(String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getExcludeHostsSize() {
    return (this.excludeHosts == null) ? 0 : this.excludeHosts.size();
  }

  public java.util.Iterator<String> getExcludeHostsIterator() {
    return (this.excludeHosts == null) ? null : this.excludeHosts.iterator();
  }

  public void addToExcludeHosts(String elem) {
    if (this.excludeHosts == null) {
      this.excludeHosts = new ArrayList<String>();
    }
    this.excludeHosts.add(elem);
  }

  public List<String> getExcludeHosts() {
    return this.excludeHosts;
  }

  public ResourceRequest setExcludeHosts(List<String> excludeHosts) {
    this.excludeHosts = excludeHosts;
    return this;
  }

  public void unsetExcludeHosts() {
    this.excludeHosts = null;
  }

  /** Returns true if field excludeHosts is set (has been assigned a value) and false otherwise */
  public boolean isSetExcludeHosts() {
    return this.excludeHosts != null;
  }

  public void setExcludeHostsIsSet(boolean value) {
    if (!value) {
      this.excludeHosts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case HOSTS:
      if (value == null) {
        unsetHosts();
      } else {
        setHosts((List<String>)value);
      }
      break;

    case SPECS:
      if (value == null) {
        unsetSpecs();
      } else {
        setSpecs((ComputeSpecs)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    case EXCLUDE_HOSTS:
      if (value == null) {
        unsetExcludeHosts();
      } else {
        setExcludeHosts((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case HOSTS:
      return getHosts();

    case SPECS:
      return getSpecs();

    case TYPE:
      return getType();

    case EXCLUDE_HOSTS:
      return getExcludeHosts();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case HOSTS:
      return isSetHosts();
    case SPECS:
      return isSetSpecs();
    case TYPE:
      return isSetType();
    case EXCLUDE_HOSTS:
      return isSetExcludeHosts();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ResourceRequest)
      return this.equals((ResourceRequest)that);
    return false;
  }

  public boolean equals(ResourceRequest that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_hosts = true && this.isSetHosts();
    boolean that_present_hosts = true && that.isSetHosts();
    if (this_present_hosts || that_present_hosts) {
      if (!(this_present_hosts && that_present_hosts))
        return false;
      if (!this.hosts.equals(that.hosts))
        return false;
    }

    boolean this_present_specs = true && this.isSetSpecs();
    boolean that_present_specs = true && that.isSetSpecs();
    if (this_present_specs || that_present_specs) {
      if (!(this_present_specs && that_present_specs))
        return false;
      if (!this.specs.equals(that.specs))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_excludeHosts = true && this.isSetExcludeHosts();
    boolean that_present_excludeHosts = true && that.isSetExcludeHosts();
    if (this_present_excludeHosts || that_present_excludeHosts) {
      if (!(this_present_excludeHosts && that_present_excludeHosts))
        return false;
      if (!this.excludeHosts.equals(that.excludeHosts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ResourceRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ResourceRequest typedOther = (ResourceRequest)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHosts()).compareTo(typedOther.isSetHosts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHosts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hosts, typedOther.hosts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpecs()).compareTo(typedOther.isSetSpecs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpecs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.specs, typedOther.specs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExcludeHosts()).compareTo(typedOther.isSetExcludeHosts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExcludeHosts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.excludeHosts, typedOther.excludeHosts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ID
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.id = iprot.readI32();
            setIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // HOSTS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
              this.hosts = new ArrayList<String>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                String _elem2; // required
                _elem2 = iprot.readString();
                this.hosts.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SPECS
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.specs = new ComputeSpecs();
            this.specs.read(iprot);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // TYPE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.type = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // EXCLUDE_HOSTS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
              this.excludeHosts = new ArrayList<String>(_list3.size);
              for (int _i4 = 0; _i4 < _list3.size; ++_i4)
              {
                String _elem5; // required
                _elem5 = iprot.readString();
                this.excludeHosts.add(_elem5);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI32(this.id);
    oprot.writeFieldEnd();
    if (this.hosts != null) {
      if (isSetHosts()) {
        oprot.writeFieldBegin(HOSTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, this.hosts.size()));
          for (String _iter6 : this.hosts)
          {
            oprot.writeString(_iter6);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.specs != null) {
      if (isSetSpecs()) {
        oprot.writeFieldBegin(SPECS_FIELD_DESC);
        this.specs.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeString(this.type);
      oprot.writeFieldEnd();
    }
    if (this.excludeHosts != null) {
      if (isSetExcludeHosts()) {
        oprot.writeFieldBegin(EXCLUDE_HOSTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, this.excludeHosts.size()));
          for (String _iter7 : this.excludeHosts)
          {
            oprot.writeString(_iter7);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ResourceRequest(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (isSetHosts()) {
      if (!first) sb.append(", ");
      sb.append("hosts:");
      if (this.hosts == null) {
        sb.append("null");
      } else {
        sb.append(this.hosts);
      }
      first = false;
    }
    if (isSetSpecs()) {
      if (!first) sb.append(", ");
      sb.append("specs:");
      if (this.specs == null) {
        sb.append("null");
      } else {
        sb.append(this.specs);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetExcludeHosts()) {
      if (!first) sb.append(", ");
      sb.append("excludeHosts:");
      if (this.excludeHosts == null) {
        sb.append("null");
      } else {
        sb.append(this.excludeHosts);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

