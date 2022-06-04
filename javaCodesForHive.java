// ORM class for table 'NEWS'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Aug 14 15:16:48 UTC 2018
// For connector: org.apache.sqoop.manager.GenericJdbcManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class NEWS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("datapacket_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        datapacket_id = (Long)value;
      }
    });
    setters.put("admission_type_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        admission_type_code = (String)value;
      }
    });
    setters.put("admission_source_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        admission_source_code = (String)value;
      }
    });
    setters.put("admission_category_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        admission_category_code = (String)value;
      }
    });
    setters.put("referrer_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        referrer_code = (String)value;
      }
    });
    setters.put("discharge_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        discharge_date = (java.sql.Date)value;
      }
    });
    setters.put("discharge_ward_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        discharge_ward_code = (String)value;
      }
    });
    setters.put("discharge_consultant_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        discharge_consultant_code = (String)value;
      }
    });
    setters.put("discharge_method_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        discharge_method_code = (String)value;
      }
    });
    setters.put("discharge_destination_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        discharge_destination_code = (String)value;
      }
    });
    setters.put("sex", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sex = (String)value;
      }
    });
    setters.put("site_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        site_code = (String)value;
      }
    });
    setters.put("ward_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ward_code = (String)value;
      }
    });
    setters.put("bay_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        bay_code = (String)value;
      }
    });
    setters.put("bay_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        bay_name = (String)value;
      }
    });
    setters.put("bed_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        bed_number = (String)value;
      }
    });
    setters.put("admission_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        admission_date = (java.sql.Date)value;
      }
    });
    setters.put("time_of_reading", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        time_of_reading = (java.sql.Date)value;
      }
    });
    setters.put("packet_type_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        packet_type_code = (String)value;
      }
    });
    setters.put("packet_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        packet_type = (String)value;
      }
    });
    setters.put("ews_score", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ews_score = (Long)value;
      }
    });
    setters.put("ews_level_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ews_level_code = (Long)value;
      }
    });
    setters.put("ews_level", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ews_level = (String)value;
      }
    });
    setters.put("ews_incomplete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ews_incomplete = (String)value;
      }
    });
    setters.put("ews_incomplete_max", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ews_incomplete_max = (Long)value;
      }
    });
    setters.put("pulse", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pulse = (String)value;
      }
    });
    setters.put("pulse_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pulse_value = (Long)value;
      }
    });
    setters.put("temp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        temp = (String)value;
      }
    });
    setters.put("temp_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        temp_value = (String)value;
      }
    });
    setters.put("bp_sys", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        bp_sys = (String)value;
      }
    });
    setters.put("bp_sys_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        bp_sys_value = (Long)value;
      }
    });
    setters.put("bp_dia", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        bp_dia = (String)value;
      }
    });
    setters.put("bp_dia_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        bp_dia_value = (Long)value;
      }
    });
    setters.put("resp_rate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        resp_rate = (String)value;
      }
    });
    setters.put("resp_rate_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        resp_rate_value = (Long)value;
      }
    });
    setters.put("avpu", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        avpu = (String)value;
      }
    });
    setters.put("o2_sats", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        o2_sats = (String)value;
      }
    });
    setters.put("o2_sats_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        o2_sats_value = (String)value;
      }
    });
    setters.put("mask_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        mask_type = (String)value;
      }
    });
    setters.put("o2_flowrate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        o2_flowrate = (String)value;
      }
    });
    setters.put("ow_conc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ow_conc = (String)value;
      }
    });
    setters.put("pain_score", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pain_score = (String)value;
      }
    });
    setters.put("pain_score_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pain_score_value = (Long)value;
      }
    });
    setters.put("nausea", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        nausea = (String)value;
      }
    });
    setters.put("vomiting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        vomiting = (String)value;
      }
    });
    setters.put("bowels", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        bowels = (String)value;
      }
    });
    setters.put("bowels_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        bowels_value = (String)value;
      }
    });
    setters.put("height", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        height = (String)value;
      }
    });
    setters.put("painheight_value_score", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        painheight_value_score = (String)value;
      }
    });
    setters.put("weight", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weight = (String)value;
      }
    });
    setters.put("weight_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weight_value = (String)value;
      }
    });
    setters.put("time_started_obs", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        time_started_obs = (String)value;
      }
    });
    setters.put("time_submitted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        time_submitted = (String)value;
      }
    });
  }
  public NEWS() {
    init0();
  }
  private Long datapacket_id;
  public Long get_datapacket_id() {
    return datapacket_id;
  }
  public void set_datapacket_id(Long datapacket_id) {
    this.datapacket_id = datapacket_id;
  }
  public NEWS with_datapacket_id(Long datapacket_id) {
    this.datapacket_id = datapacket_id;
    return this;
  }
  private String admission_type_code;
  public String get_admission_type_code() {
    return admission_type_code;
  }
  public void set_admission_type_code(String admission_type_code) {
    this.admission_type_code = admission_type_code;
  }
  public NEWS with_admission_type_code(String admission_type_code) {
    this.admission_type_code = admission_type_code;
    return this;
  }
  private String admission_source_code;
  public String get_admission_source_code() {
    return admission_source_code;
  }
  public void set_admission_source_code(String admission_source_code) {
    this.admission_source_code = admission_source_code;
  }
  public NEWS with_admission_source_code(String admission_source_code) {
    this.admission_source_code = admission_source_code;
    return this;
  }
  private String admission_category_code;
  public String get_admission_category_code() {
    return admission_category_code;
  }
  public void set_admission_category_code(String admission_category_code) {
    this.admission_category_code = admission_category_code;
  }
  public NEWS with_admission_category_code(String admission_category_code) {
    this.admission_category_code = admission_category_code;
    return this;
  }
  private String referrer_code;
  public String get_referrer_code() {
    return referrer_code;
  }
  public void set_referrer_code(String referrer_code) {
    this.referrer_code = referrer_code;
  }
  public NEWS with_referrer_code(String referrer_code) {
    this.referrer_code = referrer_code;
    return this;
  }
  private java.sql.Date discharge_date;
  public java.sql.Date get_discharge_date() {
    return discharge_date;
  }
  public void set_discharge_date(java.sql.Date discharge_date) {
    this.discharge_date = discharge_date;
  }
  public NEWS with_discharge_date(java.sql.Date discharge_date) {
    this.discharge_date = discharge_date;
    return this;
  }
  private String discharge_ward_code;
  public String get_discharge_ward_code() {
    return discharge_ward_code;
  }
  public void set_discharge_ward_code(String discharge_ward_code) {
    this.discharge_ward_code = discharge_ward_code;
  }
  public NEWS with_discharge_ward_code(String discharge_ward_code) {
    this.discharge_ward_code = discharge_ward_code;
    return this;
  }
  private String discharge_consultant_code;
  public String get_discharge_consultant_code() {
    return discharge_consultant_code;
  }
  public void set_discharge_consultant_code(String discharge_consultant_code) {
    this.discharge_consultant_code = discharge_consultant_code;
  }
  public NEWS with_discharge_consultant_code(String discharge_consultant_code) {
    this.discharge_consultant_code = discharge_consultant_code;
    return this;
  }
  private String discharge_method_code;
  public String get_discharge_method_code() {
    return discharge_method_code;
  }
  public void set_discharge_method_code(String discharge_method_code) {
    this.discharge_method_code = discharge_method_code;
  }
  public NEWS with_discharge_method_code(String discharge_method_code) {
    this.discharge_method_code = discharge_method_code;
    return this;
  }
  private String discharge_destination_code;
  public String get_discharge_destination_code() {
    return discharge_destination_code;
  }
  public void set_discharge_destination_code(String discharge_destination_code) {
    this.discharge_destination_code = discharge_destination_code;
  }
  public NEWS with_discharge_destination_code(String discharge_destination_code) {
    this.discharge_destination_code = discharge_destination_code;
    return this;
  }
  private String sex;
  public String get_sex() {
    return sex;
  }
  public void set_sex(String sex) {
    this.sex = sex;
  }
  public NEWS with_sex(String sex) {
    this.sex = sex;
    return this;
  }
  private String site_code;
  public String get_site_code() {
    return site_code;
  }
  public void set_site_code(String site_code) {
    this.site_code = site_code;
  }
  public NEWS with_site_code(String site_code) {
    this.site_code = site_code;
    return this;
  }
  private String ward_code;
  public String get_ward_code() {
    return ward_code;
  }
  public void set_ward_code(String ward_code) {
    this.ward_code = ward_code;
  }
  public NEWS with_ward_code(String ward_code) {
    this.ward_code = ward_code;
    return this;
  }
  private String bay_code;
  public String get_bay_code() {
    return bay_code;
  }
  public void set_bay_code(String bay_code) {
    this.bay_code = bay_code;
  }
  public NEWS with_bay_code(String bay_code) {
    this.bay_code = bay_code;
    return this;
  }
  private String bay_name;
  public String get_bay_name() {
    return bay_name;
  }
  public void set_bay_name(String bay_name) {
    this.bay_name = bay_name;
  }
  public NEWS with_bay_name(String bay_name) {
    this.bay_name = bay_name;
    return this;
  }
  private String bed_number;
  public String get_bed_number() {
    return bed_number;
  }
  public void set_bed_number(String bed_number) {
    this.bed_number = bed_number;
  }
  public NEWS with_bed_number(String bed_number) {
    this.bed_number = bed_number;
    return this;
  }
  private java.sql.Date admission_date;
  public java.sql.Date get_admission_date() {
    return admission_date;
  }
  public void set_admission_date(java.sql.Date admission_date) {
    this.admission_date = admission_date;
  }
  public NEWS with_admission_date(java.sql.Date admission_date) {
    this.admission_date = admission_date;
    return this;
  }
  private java.sql.Date time_of_reading;
  public java.sql.Date get_time_of_reading() {
    return time_of_reading;
  }
  public void set_time_of_reading(java.sql.Date time_of_reading) {
    this.time_of_reading = time_of_reading;
  }
  public NEWS with_time_of_reading(java.sql.Date time_of_reading) {
    this.time_of_reading = time_of_reading;
    return this;
  }
  private String packet_type_code;
  public String get_packet_type_code() {
    return packet_type_code;
  }
  public void set_packet_type_code(String packet_type_code) {
    this.packet_type_code = packet_type_code;
  }
  public NEWS with_packet_type_code(String packet_type_code) {
    this.packet_type_code = packet_type_code;
    return this;
  }
  private String packet_type;
  public String get_packet_type() {
    return packet_type;
  }
  public void set_packet_type(String packet_type) {
    this.packet_type = packet_type;
  }
  public NEWS with_packet_type(String packet_type) {
    this.packet_type = packet_type;
    return this;
  }
  private Long ews_score;
  public Long get_ews_score() {
    return ews_score;
  }
  public void set_ews_score(Long ews_score) {
    this.ews_score = ews_score;
  }
  public NEWS with_ews_score(Long ews_score) {
    this.ews_score = ews_score;
    return this;
  }
  private Long ews_level_code;
  public Long get_ews_level_code() {
    return ews_level_code;
  }
  public void set_ews_level_code(Long ews_level_code) {
    this.ews_level_code = ews_level_code;
  }
  public NEWS with_ews_level_code(Long ews_level_code) {
    this.ews_level_code = ews_level_code;
    return this;
  }
  private String ews_level;
  public String get_ews_level() {
    return ews_level;
  }
  public void set_ews_level(String ews_level) {
    this.ews_level = ews_level;
  }
  public NEWS with_ews_level(String ews_level) {
    this.ews_level = ews_level;
    return this;
  }
  private String ews_incomplete;
  public String get_ews_incomplete() {
    return ews_incomplete;
  }
  public void set_ews_incomplete(String ews_incomplete) {
    this.ews_incomplete = ews_incomplete;
  }
  public NEWS with_ews_incomplete(String ews_incomplete) {
    this.ews_incomplete = ews_incomplete;
    return this;
  }
  private Long ews_incomplete_max;
  public Long get_ews_incomplete_max() {
    return ews_incomplete_max;
  }
  public void set_ews_incomplete_max(Long ews_incomplete_max) {
    this.ews_incomplete_max = ews_incomplete_max;
  }
  public NEWS with_ews_incomplete_max(Long ews_incomplete_max) {
    this.ews_incomplete_max = ews_incomplete_max;
    return this;
  }
  private String pulse;
  public String get_pulse() {
    return pulse;
  }
  public void set_pulse(String pulse) {
    this.pulse = pulse;
  }
  public NEWS with_pulse(String pulse) {
    this.pulse = pulse;
    return this;
  }
  private Long pulse_value;
  public Long get_pulse_value() {
    return pulse_value;
  }
  public void set_pulse_value(Long pulse_value) {
    this.pulse_value = pulse_value;
  }
  public NEWS with_pulse_value(Long pulse_value) {
    this.pulse_value = pulse_value;
    return this;
  }
  private String temp;
  public String get_temp() {
    return temp;
  }
  public void set_temp(String temp) {
    this.temp = temp;
  }
  public NEWS with_temp(String temp) {
    this.temp = temp;
    return this;
  }
  private String temp_value;
  public String get_temp_value() {
    return temp_value;
  }
  public void set_temp_value(String temp_value) {
    this.temp_value = temp_value;
  }
  public NEWS with_temp_value(String temp_value) {
    this.temp_value = temp_value;
    return this;
  }
  private String bp_sys;
  public String get_bp_sys() {
    return bp_sys;
  }
  public void set_bp_sys(String bp_sys) {
    this.bp_sys = bp_sys;
  }
  public NEWS with_bp_sys(String bp_sys) {
    this.bp_sys = bp_sys;
    return this;
  }
  private Long bp_sys_value;
  public Long get_bp_sys_value() {
    return bp_sys_value;
  }
  public void set_bp_sys_value(Long bp_sys_value) {
    this.bp_sys_value = bp_sys_value;
  }
  public NEWS with_bp_sys_value(Long bp_sys_value) {
    this.bp_sys_value = bp_sys_value;
    return this;
  }
  private String bp_dia;
  public String get_bp_dia() {
    return bp_dia;
  }
  public void set_bp_dia(String bp_dia) {
    this.bp_dia = bp_dia;
  }
  public NEWS with_bp_dia(String bp_dia) {
    this.bp_dia = bp_dia;
    return this;
  }
  private Long bp_dia_value;
  public Long get_bp_dia_value() {
    return bp_dia_value;
  }
  public void set_bp_dia_value(Long bp_dia_value) {
    this.bp_dia_value = bp_dia_value;
  }
  public NEWS with_bp_dia_value(Long bp_dia_value) {
    this.bp_dia_value = bp_dia_value;
    return this;
  }
  private String resp_rate;
  public String get_resp_rate() {
    return resp_rate;
  }
  public void set_resp_rate(String resp_rate) {
    this.resp_rate = resp_rate;
  }
  public NEWS with_resp_rate(String resp_rate) {
    this.resp_rate = resp_rate;
    return this;
  }
  private Long resp_rate_value;
  public Long get_resp_rate_value() {
    return resp_rate_value;
  }
  public void set_resp_rate_value(Long resp_rate_value) {
    this.resp_rate_value = resp_rate_value;
  }
  public NEWS with_resp_rate_value(Long resp_rate_value) {
    this.resp_rate_value = resp_rate_value;
    return this;
  }
  private String avpu;
  public String get_avpu() {
    return avpu;
  }
  public void set_avpu(String avpu) {
    this.avpu = avpu;
  }
  public NEWS with_avpu(String avpu) {
    this.avpu = avpu;
    return this;
  }
  private String o2_sats;
  public String get_o2_sats() {
    return o2_sats;
  }
  public void set_o2_sats(String o2_sats) {
    this.o2_sats = o2_sats;
  }
  public NEWS with_o2_sats(String o2_sats) {
    this.o2_sats = o2_sats;
    return this;
  }
  private String o2_sats_value;
  public String get_o2_sats_value() {
    return o2_sats_value;
  }
  public void set_o2_sats_value(String o2_sats_value) {
    this.o2_sats_value = o2_sats_value;
  }
  public NEWS with_o2_sats_value(String o2_sats_value) {
    this.o2_sats_value = o2_sats_value;
    return this;
  }
  private String mask_type;
  public String get_mask_type() {
    return mask_type;
  }
  public void set_mask_type(String mask_type) {
    this.mask_type = mask_type;
  }
  public NEWS with_mask_type(String mask_type) {
    this.mask_type = mask_type;
    return this;
  }
  private String o2_flowrate;
  public String get_o2_flowrate() {
    return o2_flowrate;
  }
  public void set_o2_flowrate(String o2_flowrate) {
    this.o2_flowrate = o2_flowrate;
  }
  public NEWS with_o2_flowrate(String o2_flowrate) {
    this.o2_flowrate = o2_flowrate;
    return this;
  }
  private String ow_conc;
  public String get_ow_conc() {
    return ow_conc;
  }
  public void set_ow_conc(String ow_conc) {
    this.ow_conc = ow_conc;
  }
  public NEWS with_ow_conc(String ow_conc) {
    this.ow_conc = ow_conc;
    return this;
  }
  private String pain_score;
  public String get_pain_score() {
    return pain_score;
  }
  public void set_pain_score(String pain_score) {
    this.pain_score = pain_score;
  }
  public NEWS with_pain_score(String pain_score) {
    this.pain_score = pain_score;
    return this;
  }
  private Long pain_score_value;
  public Long get_pain_score_value() {
    return pain_score_value;
  }
  public void set_pain_score_value(Long pain_score_value) {
    this.pain_score_value = pain_score_value;
  }
  public NEWS with_pain_score_value(Long pain_score_value) {
    this.pain_score_value = pain_score_value;
    return this;
  }
  private String nausea;
  public String get_nausea() {
    return nausea;
  }
  public void set_nausea(String nausea) {
    this.nausea = nausea;
  }
  public NEWS with_nausea(String nausea) {
    this.nausea = nausea;
    return this;
  }
  private String vomiting;
  public String get_vomiting() {
    return vomiting;
  }
  public void set_vomiting(String vomiting) {
    this.vomiting = vomiting;
  }
  public NEWS with_vomiting(String vomiting) {
    this.vomiting = vomiting;
    return this;
  }
  private String bowels;
  public String get_bowels() {
    return bowels;
  }
  public void set_bowels(String bowels) {
    this.bowels = bowels;
  }
  public NEWS with_bowels(String bowels) {
    this.bowels = bowels;
    return this;
  }
  private String bowels_value;
  public String get_bowels_value() {
    return bowels_value;
  }
  public void set_bowels_value(String bowels_value) {
    this.bowels_value = bowels_value;
  }
  public NEWS with_bowels_value(String bowels_value) {
    this.bowels_value = bowels_value;
    return this;
  }
  private String height;
  public String get_height() {
    return height;
  }
  public void set_height(String height) {
    this.height = height;
  }
  public NEWS with_height(String height) {
    this.height = height;
    return this;
  }
  private String painheight_value_score;
  public String get_painheight_value_score() {
    return painheight_value_score;
  }
  public void set_painheight_value_score(String painheight_value_score) {
    this.painheight_value_score = painheight_value_score;
  }
  public NEWS with_painheight_value_score(String painheight_value_score) {
    this.painheight_value_score = painheight_value_score;
    return this;
  }
  private String weight;
  public String get_weight() {
    return weight;
  }
  public void set_weight(String weight) {
    this.weight = weight;
  }
  public NEWS with_weight(String weight) {
    this.weight = weight;
    return this;
  }
  private String weight_value;
  public String get_weight_value() {
    return weight_value;
  }
  public void set_weight_value(String weight_value) {
    this.weight_value = weight_value;
  }
  public NEWS with_weight_value(String weight_value) {
    this.weight_value = weight_value;
    return this;
  }
  private String time_started_obs;
  public String get_time_started_obs() {
    return time_started_obs;
  }
  public void set_time_started_obs(String time_started_obs) {
    this.time_started_obs = time_started_obs;
  }
  public NEWS with_time_started_obs(String time_started_obs) {
    this.time_started_obs = time_started_obs;
    return this;
  }
  private String time_submitted;
  public String get_time_submitted() {
    return time_submitted;
  }
  public void set_time_submitted(String time_submitted) {
    this.time_submitted = time_submitted;
  }
  public NEWS with_time_submitted(String time_submitted) {
    this.time_submitted = time_submitted;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof NEWS)) {
      return false;
    }
    NEWS that = (NEWS) o;
    boolean equal = true;
    equal = equal && (this.datapacket_id == null ? that.datapacket_id == null : this.datapacket_id.equals(that.datapacket_id));
    equal = equal && (this.admission_type_code == null ? that.admission_type_code == null : this.admission_type_code.equals(that.admission_type_code));
    equal = equal && (this.admission_source_code == null ? that.admission_source_code == null : this.admission_source_code.equals(that.admission_source_code));
    equal = equal && (this.admission_category_code == null ? that.admission_category_code == null : this.admission_category_code.equals(that.admission_category_code));
    equal = equal && (this.referrer_code == null ? that.referrer_code == null : this.referrer_code.equals(that.referrer_code));
    equal = equal && (this.discharge_date == null ? that.discharge_date == null : this.discharge_date.equals(that.discharge_date));
    equal = equal && (this.discharge_ward_code == null ? that.discharge_ward_code == null : this.discharge_ward_code.equals(that.discharge_ward_code));
    equal = equal && (this.discharge_consultant_code == null ? that.discharge_consultant_code == null : this.discharge_consultant_code.equals(that.discharge_consultant_code));
    equal = equal && (this.discharge_method_code == null ? that.discharge_method_code == null : this.discharge_method_code.equals(that.discharge_method_code));
    equal = equal && (this.discharge_destination_code == null ? that.discharge_destination_code == null : this.discharge_destination_code.equals(that.discharge_destination_code));
    equal = equal && (this.sex == null ? that.sex == null : this.sex.equals(that.sex));
    equal = equal && (this.site_code == null ? that.site_code == null : this.site_code.equals(that.site_code));
    equal = equal && (this.ward_code == null ? that.ward_code == null : this.ward_code.equals(that.ward_code));
    equal = equal && (this.bay_code == null ? that.bay_code == null : this.bay_code.equals(that.bay_code));
    equal = equal && (this.bay_name == null ? that.bay_name == null : this.bay_name.equals(that.bay_name));
    equal = equal && (this.bed_number == null ? that.bed_number == null : this.bed_number.equals(that.bed_number));
    equal = equal && (this.admission_date == null ? that.admission_date == null : this.admission_date.equals(that.admission_date));
    equal = equal && (this.time_of_reading == null ? that.time_of_reading == null : this.time_of_reading.equals(that.time_of_reading));
    equal = equal && (this.packet_type_code == null ? that.packet_type_code == null : this.packet_type_code.equals(that.packet_type_code));
    equal = equal && (this.packet_type == null ? that.packet_type == null : this.packet_type.equals(that.packet_type));
    equal = equal && (this.ews_score == null ? that.ews_score == null : this.ews_score.equals(that.ews_score));
    equal = equal && (this.ews_level_code == null ? that.ews_level_code == null : this.ews_level_code.equals(that.ews_level_code));
    equal = equal && (this.ews_level == null ? that.ews_level == null : this.ews_level.equals(that.ews_level));
    equal = equal && (this.ews_incomplete == null ? that.ews_incomplete == null : this.ews_incomplete.equals(that.ews_incomplete));
    equal = equal && (this.ews_incomplete_max == null ? that.ews_incomplete_max == null : this.ews_incomplete_max.equals(that.ews_incomplete_max));
    equal = equal && (this.pulse == null ? that.pulse == null : this.pulse.equals(that.pulse));
    equal = equal && (this.pulse_value == null ? that.pulse_value == null : this.pulse_value.equals(that.pulse_value));
    equal = equal && (this.temp == null ? that.temp == null : this.temp.equals(that.temp));
    equal = equal && (this.temp_value == null ? that.temp_value == null : this.temp_value.equals(that.temp_value));
    equal = equal && (this.bp_sys == null ? that.bp_sys == null : this.bp_sys.equals(that.bp_sys));
    equal = equal && (this.bp_sys_value == null ? that.bp_sys_value == null : this.bp_sys_value.equals(that.bp_sys_value));
    equal = equal && (this.bp_dia == null ? that.bp_dia == null : this.bp_dia.equals(that.bp_dia));
    equal = equal && (this.bp_dia_value == null ? that.bp_dia_value == null : this.bp_dia_value.equals(that.bp_dia_value));
    equal = equal && (this.resp_rate == null ? that.resp_rate == null : this.resp_rate.equals(that.resp_rate));
    equal = equal && (this.resp_rate_value == null ? that.resp_rate_value == null : this.resp_rate_value.equals(that.resp_rate_value));
    equal = equal && (this.avpu == null ? that.avpu == null : this.avpu.equals(that.avpu));
    equal = equal && (this.o2_sats == null ? that.o2_sats == null : this.o2_sats.equals(that.o2_sats));
    equal = equal && (this.o2_sats_value == null ? that.o2_sats_value == null : this.o2_sats_value.equals(that.o2_sats_value));
    equal = equal && (this.mask_type == null ? that.mask_type == null : this.mask_type.equals(that.mask_type));
    equal = equal && (this.o2_flowrate == null ? that.o2_flowrate == null : this.o2_flowrate.equals(that.o2_flowrate));
    equal = equal && (this.ow_conc == null ? that.ow_conc == null : this.ow_conc.equals(that.ow_conc));
    equal = equal && (this.pain_score == null ? that.pain_score == null : this.pain_score.equals(that.pain_score));
    equal = equal && (this.pain_score_value == null ? that.pain_score_value == null : this.pain_score_value.equals(that.pain_score_value));
    equal = equal && (this.nausea == null ? that.nausea == null : this.nausea.equals(that.nausea));
    equal = equal && (this.vomiting == null ? that.vomiting == null : this.vomiting.equals(that.vomiting));
    equal = equal && (this.bowels == null ? that.bowels == null : this.bowels.equals(that.bowels));
    equal = equal && (this.bowels_value == null ? that.bowels_value == null : this.bowels_value.equals(that.bowels_value));
    equal = equal && (this.height == null ? that.height == null : this.height.equals(that.height));
    equal = equal && (this.painheight_value_score == null ? that.painheight_value_score == null : this.painheight_value_score.equals(that.painheight_value_score));
    equal = equal && (this.weight == null ? that.weight == null : this.weight.equals(that.weight));
    equal = equal && (this.weight_value == null ? that.weight_value == null : this.weight_value.equals(that.weight_value));
    equal = equal && (this.time_started_obs == null ? that.time_started_obs == null : this.time_started_obs.equals(that.time_started_obs));
    equal = equal && (this.time_submitted == null ? that.time_submitted == null : this.time_submitted.equals(that.time_submitted));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof NEWS)) {
      return false;
    }
    NEWS that = (NEWS) o;
    boolean equal = true;
    equal = equal && (this.datapacket_id == null ? that.datapacket_id == null : this.datapacket_id.equals(that.datapacket_id));
    equal = equal && (this.admission_type_code == null ? that.admission_type_code == null : this.admission_type_code.equals(that.admission_type_code));
    equal = equal && (this.admission_source_code == null ? that.admission_source_code == null : this.admission_source_code.equals(that.admission_source_code));
    equal = equal && (this.admission_category_code == null ? that.admission_category_code == null : this.admission_category_code.equals(that.admission_category_code));
    equal = equal && (this.referrer_code == null ? that.referrer_code == null : this.referrer_code.equals(that.referrer_code));
    equal = equal && (this.discharge_date == null ? that.discharge_date == null : this.discharge_date.equals(that.discharge_date));
    equal = equal && (this.discharge_ward_code == null ? that.discharge_ward_code == null : this.discharge_ward_code.equals(that.discharge_ward_code));
    equal = equal && (this.discharge_consultant_code == null ? that.discharge_consultant_code == null : this.discharge_consultant_code.equals(that.discharge_consultant_code));
    equal = equal && (this.discharge_method_code == null ? that.discharge_method_code == null : this.discharge_method_code.equals(that.discharge_method_code));
    equal = equal && (this.discharge_destination_code == null ? that.discharge_destination_code == null : this.discharge_destination_code.equals(that.discharge_destination_code));
    equal = equal && (this.sex == null ? that.sex == null : this.sex.equals(that.sex));
    equal = equal && (this.site_code == null ? that.site_code == null : this.site_code.equals(that.site_code));
    equal = equal && (this.ward_code == null ? that.ward_code == null : this.ward_code.equals(that.ward_code));
    equal = equal && (this.bay_code == null ? that.bay_code == null : this.bay_code.equals(that.bay_code));
    equal = equal && (this.bay_name == null ? that.bay_name == null : this.bay_name.equals(that.bay_name));
    equal = equal && (this.bed_number == null ? that.bed_number == null : this.bed_number.equals(that.bed_number));
    equal = equal && (this.admission_date == null ? that.admission_date == null : this.admission_date.equals(that.admission_date));
    equal = equal && (this.time_of_reading == null ? that.time_of_reading == null : this.time_of_reading.equals(that.time_of_reading));
    equal = equal && (this.packet_type_code == null ? that.packet_type_code == null : this.packet_type_code.equals(that.packet_type_code));
    equal = equal && (this.packet_type == null ? that.packet_type == null : this.packet_type.equals(that.packet_type));
    equal = equal && (this.ews_score == null ? that.ews_score == null : this.ews_score.equals(that.ews_score));
    equal = equal && (this.ews_level_code == null ? that.ews_level_code == null : this.ews_level_code.equals(that.ews_level_code));
    equal = equal && (this.ews_level == null ? that.ews_level == null : this.ews_level.equals(that.ews_level));
    equal = equal && (this.ews_incomplete == null ? that.ews_incomplete == null : this.ews_incomplete.equals(that.ews_incomplete));
    equal = equal && (this.ews_incomplete_max == null ? that.ews_incomplete_max == null : this.ews_incomplete_max.equals(that.ews_incomplete_max));
    equal = equal && (this.pulse == null ? that.pulse == null : this.pulse.equals(that.pulse));
    equal = equal && (this.pulse_value == null ? that.pulse_value == null : this.pulse_value.equals(that.pulse_value));
    equal = equal && (this.temp == null ? that.temp == null : this.temp.equals(that.temp));
    equal = equal && (this.temp_value == null ? that.temp_value == null : this.temp_value.equals(that.temp_value));
    equal = equal && (this.bp_sys == null ? that.bp_sys == null : this.bp_sys.equals(that.bp_sys));
    equal = equal && (this.bp_sys_value == null ? that.bp_sys_value == null : this.bp_sys_value.equals(that.bp_sys_value));
    equal = equal && (this.bp_dia == null ? that.bp_dia == null : this.bp_dia.equals(that.bp_dia));
    equal = equal && (this.bp_dia_value == null ? that.bp_dia_value == null : this.bp_dia_value.equals(that.bp_dia_value));
    equal = equal && (this.resp_rate == null ? that.resp_rate == null : this.resp_rate.equals(that.resp_rate));
    equal = equal && (this.resp_rate_value == null ? that.resp_rate_value == null : this.resp_rate_value.equals(that.resp_rate_value));
    equal = equal && (this.avpu == null ? that.avpu == null : this.avpu.equals(that.avpu));
    equal = equal && (this.o2_sats == null ? that.o2_sats == null : this.o2_sats.equals(that.o2_sats));
    equal = equal && (this.o2_sats_value == null ? that.o2_sats_value == null : this.o2_sats_value.equals(that.o2_sats_value));
    equal = equal && (this.mask_type == null ? that.mask_type == null : this.mask_type.equals(that.mask_type));
    equal = equal && (this.o2_flowrate == null ? that.o2_flowrate == null : this.o2_flowrate.equals(that.o2_flowrate));
    equal = equal && (this.ow_conc == null ? that.ow_conc == null : this.ow_conc.equals(that.ow_conc));
    equal = equal && (this.pain_score == null ? that.pain_score == null : this.pain_score.equals(that.pain_score));
    equal = equal && (this.pain_score_value == null ? that.pain_score_value == null : this.pain_score_value.equals(that.pain_score_value));
    equal = equal && (this.nausea == null ? that.nausea == null : this.nausea.equals(that.nausea));
    equal = equal && (this.vomiting == null ? that.vomiting == null : this.vomiting.equals(that.vomiting));
    equal = equal && (this.bowels == null ? that.bowels == null : this.bowels.equals(that.bowels));
    equal = equal && (this.bowels_value == null ? that.bowels_value == null : this.bowels_value.equals(that.bowels_value));
    equal = equal && (this.height == null ? that.height == null : this.height.equals(that.height));
    equal = equal && (this.painheight_value_score == null ? that.painheight_value_score == null : this.painheight_value_score.equals(that.painheight_value_score));
    equal = equal && (this.weight == null ? that.weight == null : this.weight.equals(that.weight));
    equal = equal && (this.weight_value == null ? that.weight_value == null : this.weight_value.equals(that.weight_value));
    equal = equal && (this.time_started_obs == null ? that.time_started_obs == null : this.time_started_obs.equals(that.time_started_obs));
    equal = equal && (this.time_submitted == null ? that.time_submitted == null : this.time_submitted.equals(that.time_submitted));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.datapacket_id = JdbcWritableBridge.readLong(1, __dbResults);
    this.admission_type_code = JdbcWritableBridge.readString(2, __dbResults);
    this.admission_source_code = JdbcWritableBridge.readString(3, __dbResults);
    this.admission_category_code = JdbcWritableBridge.readString(4, __dbResults);
    this.referrer_code = JdbcWritableBridge.readString(5, __dbResults);
    this.discharge_date = JdbcWritableBridge.readDate(6, __dbResults);
    this.discharge_ward_code = JdbcWritableBridge.readString(7, __dbResults);
    this.discharge_consultant_code = JdbcWritableBridge.readString(8, __dbResults);
    this.discharge_method_code = JdbcWritableBridge.readString(9, __dbResults);
    this.discharge_destination_code = JdbcWritableBridge.readString(10, __dbResults);
    this.sex = JdbcWritableBridge.readString(11, __dbResults);
    this.site_code = JdbcWritableBridge.readString(12, __dbResults);
    this.ward_code = JdbcWritableBridge.readString(13, __dbResults);
    this.bay_code = JdbcWritableBridge.readString(14, __dbResults);
    this.bay_name = JdbcWritableBridge.readString(15, __dbResults);
    this.bed_number = JdbcWritableBridge.readString(16, __dbResults);
    this.admission_date = JdbcWritableBridge.readDate(17, __dbResults);
    this.time_of_reading = JdbcWritableBridge.readDate(18, __dbResults);
    this.packet_type_code = JdbcWritableBridge.readString(19, __dbResults);
    this.packet_type = JdbcWritableBridge.readString(20, __dbResults);
    this.ews_score = JdbcWritableBridge.readLong(21, __dbResults);
    this.ews_level_code = JdbcWritableBridge.readLong(22, __dbResults);
    this.ews_level = JdbcWritableBridge.readString(23, __dbResults);
    this.ews_incomplete = JdbcWritableBridge.readString(24, __dbResults);
    this.ews_incomplete_max = JdbcWritableBridge.readLong(25, __dbResults);
    this.pulse = JdbcWritableBridge.readString(26, __dbResults);
    this.pulse_value = JdbcWritableBridge.readLong(27, __dbResults);
    this.temp = JdbcWritableBridge.readString(28, __dbResults);
    this.temp_value = JdbcWritableBridge.readString(29, __dbResults);
    this.bp_sys = JdbcWritableBridge.readString(30, __dbResults);
    this.bp_sys_value = JdbcWritableBridge.readLong(31, __dbResults);
    this.bp_dia = JdbcWritableBridge.readString(32, __dbResults);
    this.bp_dia_value = JdbcWritableBridge.readLong(33, __dbResults);
    this.resp_rate = JdbcWritableBridge.readString(34, __dbResults);
    this.resp_rate_value = JdbcWritableBridge.readLong(35, __dbResults);
    this.avpu = JdbcWritableBridge.readString(36, __dbResults);
    this.o2_sats = JdbcWritableBridge.readString(37, __dbResults);
    this.o2_sats_value = JdbcWritableBridge.readString(38, __dbResults);
    this.mask_type = JdbcWritableBridge.readString(39, __dbResults);
    this.o2_flowrate = JdbcWritableBridge.readString(40, __dbResults);
    this.ow_conc = JdbcWritableBridge.readString(41, __dbResults);
    this.pain_score = JdbcWritableBridge.readString(42, __dbResults);
    this.pain_score_value = JdbcWritableBridge.readLong(43, __dbResults);
    this.nausea = JdbcWritableBridge.readString(44, __dbResults);
    this.vomiting = JdbcWritableBridge.readString(45, __dbResults);
    this.bowels = JdbcWritableBridge.readString(46, __dbResults);
    this.bowels_value = JdbcWritableBridge.readString(47, __dbResults);
    this.height = JdbcWritableBridge.readString(48, __dbResults);
    this.painheight_value_score = JdbcWritableBridge.readString(49, __dbResults);
    this.weight = JdbcWritableBridge.readString(50, __dbResults);
    this.weight_value = JdbcWritableBridge.readString(51, __dbResults);
    this.time_started_obs = JdbcWritableBridge.readString(52, __dbResults);
    this.time_submitted = JdbcWritableBridge.readString(53, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.datapacket_id = JdbcWritableBridge.readLong(1, __dbResults);
    this.admission_type_code = JdbcWritableBridge.readString(2, __dbResults);
    this.admission_source_code = JdbcWritableBridge.readString(3, __dbResults);
    this.admission_category_code = JdbcWritableBridge.readString(4, __dbResults);
    this.referrer_code = JdbcWritableBridge.readString(5, __dbResults);
    this.discharge_date = JdbcWritableBridge.readDate(6, __dbResults);
    this.discharge_ward_code = JdbcWritableBridge.readString(7, __dbResults);
    this.discharge_consultant_code = JdbcWritableBridge.readString(8, __dbResults);
    this.discharge_method_code = JdbcWritableBridge.readString(9, __dbResults);
    this.discharge_destination_code = JdbcWritableBridge.readString(10, __dbResults);
    this.sex = JdbcWritableBridge.readString(11, __dbResults);
    this.site_code = JdbcWritableBridge.readString(12, __dbResults);
    this.ward_code = JdbcWritableBridge.readString(13, __dbResults);
    this.bay_code = JdbcWritableBridge.readString(14, __dbResults);
    this.bay_name = JdbcWritableBridge.readString(15, __dbResults);
    this.bed_number = JdbcWritableBridge.readString(16, __dbResults);
    this.admission_date = JdbcWritableBridge.readDate(17, __dbResults);
    this.time_of_reading = JdbcWritableBridge.readDate(18, __dbResults);
    this.packet_type_code = JdbcWritableBridge.readString(19, __dbResults);
    this.packet_type = JdbcWritableBridge.readString(20, __dbResults);
    this.ews_score = JdbcWritableBridge.readLong(21, __dbResults);
    this.ews_level_code = JdbcWritableBridge.readLong(22, __dbResults);
    this.ews_level = JdbcWritableBridge.readString(23, __dbResults);
    this.ews_incomplete = JdbcWritableBridge.readString(24, __dbResults);
    this.ews_incomplete_max = JdbcWritableBridge.readLong(25, __dbResults);
    this.pulse = JdbcWritableBridge.readString(26, __dbResults);
    this.pulse_value = JdbcWritableBridge.readLong(27, __dbResults);
    this.temp = JdbcWritableBridge.readString(28, __dbResults);
    this.temp_value = JdbcWritableBridge.readString(29, __dbResults);
    this.bp_sys = JdbcWritableBridge.readString(30, __dbResults);
    this.bp_sys_value = JdbcWritableBridge.readLong(31, __dbResults);
    this.bp_dia = JdbcWritableBridge.readString(32, __dbResults);
    this.bp_dia_value = JdbcWritableBridge.readLong(33, __dbResults);
    this.resp_rate = JdbcWritableBridge.readString(34, __dbResults);
    this.resp_rate_value = JdbcWritableBridge.readLong(35, __dbResults);
    this.avpu = JdbcWritableBridge.readString(36, __dbResults);
    this.o2_sats = JdbcWritableBridge.readString(37, __dbResults);
    this.o2_sats_value = JdbcWritableBridge.readString(38, __dbResults);
    this.mask_type = JdbcWritableBridge.readString(39, __dbResults);
    this.o2_flowrate = JdbcWritableBridge.readString(40, __dbResults);
    this.ow_conc = JdbcWritableBridge.readString(41, __dbResults);
    this.pain_score = JdbcWritableBridge.readString(42, __dbResults);
    this.pain_score_value = JdbcWritableBridge.readLong(43, __dbResults);
    this.nausea = JdbcWritableBridge.readString(44, __dbResults);
    this.vomiting = JdbcWritableBridge.readString(45, __dbResults);
    this.bowels = JdbcWritableBridge.readString(46, __dbResults);
    this.bowels_value = JdbcWritableBridge.readString(47, __dbResults);
    this.height = JdbcWritableBridge.readString(48, __dbResults);
    this.painheight_value_score = JdbcWritableBridge.readString(49, __dbResults);
    this.weight = JdbcWritableBridge.readString(50, __dbResults);
    this.weight_value = JdbcWritableBridge.readString(51, __dbResults);
    this.time_started_obs = JdbcWritableBridge.readString(52, __dbResults);
    this.time_submitted = JdbcWritableBridge.readString(53, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(datapacket_id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(admission_type_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(admission_source_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(admission_category_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(referrer_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(discharge_date, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(discharge_ward_code, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(discharge_consultant_code, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(discharge_method_code, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(discharge_destination_code, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sex, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(site_code, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ward_code, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bay_code, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bay_name, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bed_number, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(admission_date, 17 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(time_of_reading, 18 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(packet_type_code, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(packet_type, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(ews_score, 21 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(ews_level_code, 22 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(ews_level, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ews_incomplete, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(ews_incomplete_max, 25 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(pulse, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(pulse_value, 27 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(temp, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(temp_value, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bp_sys, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(bp_sys_value, 31 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(bp_dia, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(bp_dia_value, 33 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(resp_rate, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(resp_rate_value, 35 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(avpu, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(o2_sats, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(o2_sats_value, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mask_type, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(o2_flowrate, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ow_conc, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pain_score, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(pain_score_value, 43 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(nausea, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(vomiting, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bowels, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bowels_value, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(height, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(painheight_value_score, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(weight, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(weight_value, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(time_started_obs, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(time_submitted, 53 + __off, 12, __dbStmt);
    return 53;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(datapacket_id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(admission_type_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(admission_source_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(admission_category_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(referrer_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(discharge_date, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(discharge_ward_code, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(discharge_consultant_code, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(discharge_method_code, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(discharge_destination_code, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sex, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(site_code, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ward_code, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bay_code, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bay_name, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bed_number, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(admission_date, 17 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(time_of_reading, 18 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(packet_type_code, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(packet_type, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(ews_score, 21 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(ews_level_code, 22 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(ews_level, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ews_incomplete, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(ews_incomplete_max, 25 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(pulse, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(pulse_value, 27 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(temp, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(temp_value, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bp_sys, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(bp_sys_value, 31 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(bp_dia, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(bp_dia_value, 33 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(resp_rate, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(resp_rate_value, 35 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(avpu, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(o2_sats, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(o2_sats_value, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mask_type, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(o2_flowrate, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ow_conc, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pain_score, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(pain_score_value, 43 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(nausea, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(vomiting, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bowels, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bowels_value, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(height, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(painheight_value_score, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(weight, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(weight_value, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(time_started_obs, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(time_submitted, 53 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.datapacket_id = null;
    } else {
    this.datapacket_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.admission_type_code = null;
    } else {
    this.admission_type_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.admission_source_code = null;
    } else {
    this.admission_source_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.admission_category_code = null;
    } else {
    this.admission_category_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.referrer_code = null;
    } else {
    this.referrer_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.discharge_date = null;
    } else {
    this.discharge_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.discharge_ward_code = null;
    } else {
    this.discharge_ward_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.discharge_consultant_code = null;
    } else {
    this.discharge_consultant_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.discharge_method_code = null;
    } else {
    this.discharge_method_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.discharge_destination_code = null;
    } else {
    this.discharge_destination_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sex = null;
    } else {
    this.sex = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.site_code = null;
    } else {
    this.site_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ward_code = null;
    } else {
    this.ward_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bay_code = null;
    } else {
    this.bay_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bay_name = null;
    } else {
    this.bay_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bed_number = null;
    } else {
    this.bed_number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.admission_date = null;
    } else {
    this.admission_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.time_of_reading = null;
    } else {
    this.time_of_reading = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.packet_type_code = null;
    } else {
    this.packet_type_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.packet_type = null;
    } else {
    this.packet_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ews_score = null;
    } else {
    this.ews_score = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.ews_level_code = null;
    } else {
    this.ews_level_code = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.ews_level = null;
    } else {
    this.ews_level = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ews_incomplete = null;
    } else {
    this.ews_incomplete = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ews_incomplete_max = null;
    } else {
    this.ews_incomplete_max = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.pulse = null;
    } else {
    this.pulse = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pulse_value = null;
    } else {
    this.pulse_value = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.temp = null;
    } else {
    this.temp = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.temp_value = null;
    } else {
    this.temp_value = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bp_sys = null;
    } else {
    this.bp_sys = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bp_sys_value = null;
    } else {
    this.bp_sys_value = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.bp_dia = null;
    } else {
    this.bp_dia = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bp_dia_value = null;
    } else {
    this.bp_dia_value = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.resp_rate = null;
    } else {
    this.resp_rate = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.resp_rate_value = null;
    } else {
    this.resp_rate_value = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.avpu = null;
    } else {
    this.avpu = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.o2_sats = null;
    } else {
    this.o2_sats = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.o2_sats_value = null;
    } else {
    this.o2_sats_value = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.mask_type = null;
    } else {
    this.mask_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.o2_flowrate = null;
    } else {
    this.o2_flowrate = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ow_conc = null;
    } else {
    this.ow_conc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pain_score = null;
    } else {
    this.pain_score = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pain_score_value = null;
    } else {
    this.pain_score_value = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.nausea = null;
    } else {
    this.nausea = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.vomiting = null;
    } else {
    this.vomiting = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bowels = null;
    } else {
    this.bowels = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bowels_value = null;
    } else {
    this.bowels_value = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.height = null;
    } else {
    this.height = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.painheight_value_score = null;
    } else {
    this.painheight_value_score = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.weight = null;
    } else {
    this.weight = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.weight_value = null;
    } else {
    this.weight_value = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.time_started_obs = null;
    } else {
    this.time_started_obs = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.time_submitted = null;
    } else {
    this.time_submitted = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.datapacket_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datapacket_id);
    }
    if (null == this.admission_type_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, admission_type_code);
    }
    if (null == this.admission_source_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, admission_source_code);
    }
    if (null == this.admission_category_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, admission_category_code);
    }
    if (null == this.referrer_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, referrer_code);
    }
    if (null == this.discharge_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.discharge_date.getTime());
    }
    if (null == this.discharge_ward_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, discharge_ward_code);
    }
    if (null == this.discharge_consultant_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, discharge_consultant_code);
    }
    if (null == this.discharge_method_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, discharge_method_code);
    }
    if (null == this.discharge_destination_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, discharge_destination_code);
    }
    if (null == this.sex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sex);
    }
    if (null == this.site_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, site_code);
    }
    if (null == this.ward_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ward_code);
    }
    if (null == this.bay_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bay_code);
    }
    if (null == this.bay_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bay_name);
    }
    if (null == this.bed_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bed_number);
    }
    if (null == this.admission_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.admission_date.getTime());
    }
    if (null == this.time_of_reading) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.time_of_reading.getTime());
    }
    if (null == this.packet_type_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, packet_type_code);
    }
    if (null == this.packet_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, packet_type);
    }
    if (null == this.ews_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ews_score);
    }
    if (null == this.ews_level_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ews_level_code);
    }
    if (null == this.ews_level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ews_level);
    }
    if (null == this.ews_incomplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ews_incomplete);
    }
    if (null == this.ews_incomplete_max) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ews_incomplete_max);
    }
    if (null == this.pulse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pulse);
    }
    if (null == this.pulse_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pulse_value);
    }
    if (null == this.temp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, temp);
    }
    if (null == this.temp_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, temp_value);
    }
    if (null == this.bp_sys) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bp_sys);
    }
    if (null == this.bp_sys_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.bp_sys_value);
    }
    if (null == this.bp_dia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bp_dia);
    }
    if (null == this.bp_dia_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.bp_dia_value);
    }
    if (null == this.resp_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, resp_rate);
    }
    if (null == this.resp_rate_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.resp_rate_value);
    }
    if (null == this.avpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, avpu);
    }
    if (null == this.o2_sats) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, o2_sats);
    }
    if (null == this.o2_sats_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, o2_sats_value);
    }
    if (null == this.mask_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mask_type);
    }
    if (null == this.o2_flowrate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, o2_flowrate);
    }
    if (null == this.ow_conc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ow_conc);
    }
    if (null == this.pain_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pain_score);
    }
    if (null == this.pain_score_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pain_score_value);
    }
    if (null == this.nausea) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nausea);
    }
    if (null == this.vomiting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vomiting);
    }
    if (null == this.bowels) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bowels);
    }
    if (null == this.bowels_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bowels_value);
    }
    if (null == this.height) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, height);
    }
    if (null == this.painheight_value_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, painheight_value_score);
    }
    if (null == this.weight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weight);
    }
    if (null == this.weight_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weight_value);
    }
    if (null == this.time_started_obs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, time_started_obs);
    }
    if (null == this.time_submitted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, time_submitted);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.datapacket_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datapacket_id);
    }
    if (null == this.admission_type_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, admission_type_code);
    }
    if (null == this.admission_source_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, admission_source_code);
    }
    if (null == this.admission_category_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, admission_category_code);
    }
    if (null == this.referrer_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, referrer_code);
    }
    if (null == this.discharge_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.discharge_date.getTime());
    }
    if (null == this.discharge_ward_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, discharge_ward_code);
    }
    if (null == this.discharge_consultant_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, discharge_consultant_code);
    }
    if (null == this.discharge_method_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, discharge_method_code);
    }
    if (null == this.discharge_destination_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, discharge_destination_code);
    }
    if (null == this.sex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sex);
    }
    if (null == this.site_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, site_code);
    }
    if (null == this.ward_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ward_code);
    }
    if (null == this.bay_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bay_code);
    }
    if (null == this.bay_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bay_name);
    }
    if (null == this.bed_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bed_number);
    }
    if (null == this.admission_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.admission_date.getTime());
    }
    if (null == this.time_of_reading) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.time_of_reading.getTime());
    }
    if (null == this.packet_type_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, packet_type_code);
    }
    if (null == this.packet_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, packet_type);
    }
    if (null == this.ews_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ews_score);
    }
    if (null == this.ews_level_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ews_level_code);
    }
    if (null == this.ews_level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ews_level);
    }
    if (null == this.ews_incomplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ews_incomplete);
    }
    if (null == this.ews_incomplete_max) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ews_incomplete_max);
    }
    if (null == this.pulse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pulse);
    }
    if (null == this.pulse_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pulse_value);
    }
    if (null == this.temp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, temp);
    }
    if (null == this.temp_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, temp_value);
    }
    if (null == this.bp_sys) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bp_sys);
    }
    if (null == this.bp_sys_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.bp_sys_value);
    }
    if (null == this.bp_dia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bp_dia);
    }
    if (null == this.bp_dia_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.bp_dia_value);
    }
    if (null == this.resp_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, resp_rate);
    }
    if (null == this.resp_rate_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.resp_rate_value);
    }
    if (null == this.avpu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, avpu);
    }
    if (null == this.o2_sats) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, o2_sats);
    }
    if (null == this.o2_sats_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, o2_sats_value);
    }
    if (null == this.mask_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mask_type);
    }
    if (null == this.o2_flowrate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, o2_flowrate);
    }
    if (null == this.ow_conc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ow_conc);
    }
    if (null == this.pain_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pain_score);
    }
    if (null == this.pain_score_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pain_score_value);
    }
    if (null == this.nausea) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nausea);
    }
    if (null == this.vomiting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vomiting);
    }
    if (null == this.bowels) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bowels);
    }
    if (null == this.bowels_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bowels_value);
    }
    if (null == this.height) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, height);
    }
    if (null == this.painheight_value_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, painheight_value_score);
    }
    if (null == this.weight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weight);
    }
    if (null == this.weight_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weight_value);
    }
    if (null == this.time_started_obs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, time_started_obs);
    }
    if (null == this.time_submitted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, time_submitted);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(datapacket_id==null?"null":"" + datapacket_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admission_type_code==null?"null":admission_type_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admission_source_code==null?"null":admission_source_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admission_category_code==null?"null":admission_category_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(referrer_code==null?"null":referrer_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discharge_date==null?"null":"" + discharge_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discharge_ward_code==null?"null":discharge_ward_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discharge_consultant_code==null?"null":discharge_consultant_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discharge_method_code==null?"null":discharge_method_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discharge_destination_code==null?"null":discharge_destination_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sex==null?"null":sex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(site_code==null?"null":site_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ward_code==null?"null":ward_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bay_code==null?"null":bay_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bay_name==null?"null":bay_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bed_number==null?"null":bed_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admission_date==null?"null":"" + admission_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time_of_reading==null?"null":"" + time_of_reading, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(packet_type_code==null?"null":packet_type_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(packet_type==null?"null":packet_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ews_score==null?"null":"" + ews_score, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ews_level_code==null?"null":"" + ews_level_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ews_level==null?"null":ews_level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ews_incomplete==null?"null":ews_incomplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ews_incomplete_max==null?"null":"" + ews_incomplete_max, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pulse==null?"null":pulse, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pulse_value==null?"null":"" + pulse_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(temp==null?"null":temp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(temp_value==null?"null":temp_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bp_sys==null?"null":bp_sys, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bp_sys_value==null?"null":"" + bp_sys_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bp_dia==null?"null":bp_dia, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bp_dia_value==null?"null":"" + bp_dia_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(resp_rate==null?"null":resp_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(resp_rate_value==null?"null":"" + resp_rate_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avpu==null?"null":avpu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o2_sats==null?"null":o2_sats, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o2_sats_value==null?"null":o2_sats_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mask_type==null?"null":mask_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o2_flowrate==null?"null":o2_flowrate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ow_conc==null?"null":ow_conc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pain_score==null?"null":pain_score, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pain_score_value==null?"null":"" + pain_score_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nausea==null?"null":nausea, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vomiting==null?"null":vomiting, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bowels==null?"null":bowels, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bowels_value==null?"null":bowels_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(height==null?"null":height, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(painheight_value_score==null?"null":painheight_value_score, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weight==null?"null":weight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weight_value==null?"null":weight_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time_started_obs==null?"null":time_started_obs, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time_submitted==null?"null":time_submitted, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(datapacket_id==null?"null":"" + datapacket_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admission_type_code==null?"null":admission_type_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admission_source_code==null?"null":admission_source_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admission_category_code==null?"null":admission_category_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(referrer_code==null?"null":referrer_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discharge_date==null?"null":"" + discharge_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discharge_ward_code==null?"null":discharge_ward_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discharge_consultant_code==null?"null":discharge_consultant_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discharge_method_code==null?"null":discharge_method_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(discharge_destination_code==null?"null":discharge_destination_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sex==null?"null":sex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(site_code==null?"null":site_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ward_code==null?"null":ward_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bay_code==null?"null":bay_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bay_name==null?"null":bay_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bed_number==null?"null":bed_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(admission_date==null?"null":"" + admission_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time_of_reading==null?"null":"" + time_of_reading, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(packet_type_code==null?"null":packet_type_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(packet_type==null?"null":packet_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ews_score==null?"null":"" + ews_score, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ews_level_code==null?"null":"" + ews_level_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ews_level==null?"null":ews_level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ews_incomplete==null?"null":ews_incomplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ews_incomplete_max==null?"null":"" + ews_incomplete_max, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pulse==null?"null":pulse, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pulse_value==null?"null":"" + pulse_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(temp==null?"null":temp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(temp_value==null?"null":temp_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bp_sys==null?"null":bp_sys, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bp_sys_value==null?"null":"" + bp_sys_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bp_dia==null?"null":bp_dia, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bp_dia_value==null?"null":"" + bp_dia_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(resp_rate==null?"null":resp_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(resp_rate_value==null?"null":"" + resp_rate_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avpu==null?"null":avpu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o2_sats==null?"null":o2_sats, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o2_sats_value==null?"null":o2_sats_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mask_type==null?"null":mask_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o2_flowrate==null?"null":o2_flowrate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ow_conc==null?"null":ow_conc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pain_score==null?"null":pain_score, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pain_score_value==null?"null":"" + pain_score_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nausea==null?"null":nausea, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vomiting==null?"null":vomiting, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bowels==null?"null":bowels, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bowels_value==null?"null":bowels_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(height==null?"null":height, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(painheight_value_score==null?"null":painheight_value_score, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weight==null?"null":weight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weight_value==null?"null":weight_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time_started_obs==null?"null":time_started_obs, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time_submitted==null?"null":time_submitted, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datapacket_id = null; } else {
      this.datapacket_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.admission_type_code = null; } else {
      this.admission_type_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.admission_source_code = null; } else {
      this.admission_source_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.admission_category_code = null; } else {
      this.admission_category_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.referrer_code = null; } else {
      this.referrer_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.discharge_date = null; } else {
      this.discharge_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.discharge_ward_code = null; } else {
      this.discharge_ward_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.discharge_consultant_code = null; } else {
      this.discharge_consultant_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.discharge_method_code = null; } else {
      this.discharge_method_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.discharge_destination_code = null; } else {
      this.discharge_destination_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sex = null; } else {
      this.sex = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.site_code = null; } else {
      this.site_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ward_code = null; } else {
      this.ward_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bay_code = null; } else {
      this.bay_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bay_name = null; } else {
      this.bay_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bed_number = null; } else {
      this.bed_number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.admission_date = null; } else {
      this.admission_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.time_of_reading = null; } else {
      this.time_of_reading = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.packet_type_code = null; } else {
      this.packet_type_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.packet_type = null; } else {
      this.packet_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ews_score = null; } else {
      this.ews_score = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ews_level_code = null; } else {
      this.ews_level_code = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ews_level = null; } else {
      this.ews_level = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ews_incomplete = null; } else {
      this.ews_incomplete = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ews_incomplete_max = null; } else {
      this.ews_incomplete_max = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.pulse = null; } else {
      this.pulse = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pulse_value = null; } else {
      this.pulse_value = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.temp = null; } else {
      this.temp = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.temp_value = null; } else {
      this.temp_value = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bp_sys = null; } else {
      this.bp_sys = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bp_sys_value = null; } else {
      this.bp_sys_value = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bp_dia = null; } else {
      this.bp_dia = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bp_dia_value = null; } else {
      this.bp_dia_value = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.resp_rate = null; } else {
      this.resp_rate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.resp_rate_value = null; } else {
      this.resp_rate_value = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.avpu = null; } else {
      this.avpu = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.o2_sats = null; } else {
      this.o2_sats = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.o2_sats_value = null; } else {
      this.o2_sats_value = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.mask_type = null; } else {
      this.mask_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.o2_flowrate = null; } else {
      this.o2_flowrate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ow_conc = null; } else {
      this.ow_conc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.pain_score = null; } else {
      this.pain_score = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pain_score_value = null; } else {
      this.pain_score_value = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nausea = null; } else {
      this.nausea = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.vomiting = null; } else {
      this.vomiting = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bowels = null; } else {
      this.bowels = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bowels_value = null; } else {
      this.bowels_value = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.height = null; } else {
      this.height = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.painheight_value_score = null; } else {
      this.painheight_value_score = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.weight = null; } else {
      this.weight = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.weight_value = null; } else {
      this.weight_value = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.time_started_obs = null; } else {
      this.time_started_obs = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.time_submitted = null; } else {
      this.time_submitted = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datapacket_id = null; } else {
      this.datapacket_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.admission_type_code = null; } else {
      this.admission_type_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.admission_source_code = null; } else {
      this.admission_source_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.admission_category_code = null; } else {
      this.admission_category_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.referrer_code = null; } else {
      this.referrer_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.discharge_date = null; } else {
      this.discharge_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.discharge_ward_code = null; } else {
      this.discharge_ward_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.discharge_consultant_code = null; } else {
      this.discharge_consultant_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.discharge_method_code = null; } else {
      this.discharge_method_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.discharge_destination_code = null; } else {
      this.discharge_destination_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sex = null; } else {
      this.sex = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.site_code = null; } else {
      this.site_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ward_code = null; } else {
      this.ward_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bay_code = null; } else {
      this.bay_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bay_name = null; } else {
      this.bay_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bed_number = null; } else {
      this.bed_number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.admission_date = null; } else {
      this.admission_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.time_of_reading = null; } else {
      this.time_of_reading = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.packet_type_code = null; } else {
      this.packet_type_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.packet_type = null; } else {
      this.packet_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ews_score = null; } else {
      this.ews_score = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ews_level_code = null; } else {
      this.ews_level_code = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ews_level = null; } else {
      this.ews_level = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ews_incomplete = null; } else {
      this.ews_incomplete = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ews_incomplete_max = null; } else {
      this.ews_incomplete_max = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.pulse = null; } else {
      this.pulse = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pulse_value = null; } else {
      this.pulse_value = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.temp = null; } else {
      this.temp = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.temp_value = null; } else {
      this.temp_value = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bp_sys = null; } else {
      this.bp_sys = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bp_sys_value = null; } else {
      this.bp_sys_value = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bp_dia = null; } else {
      this.bp_dia = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bp_dia_value = null; } else {
      this.bp_dia_value = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.resp_rate = null; } else {
      this.resp_rate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.resp_rate_value = null; } else {
      this.resp_rate_value = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.avpu = null; } else {
      this.avpu = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.o2_sats = null; } else {
      this.o2_sats = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.o2_sats_value = null; } else {
      this.o2_sats_value = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.mask_type = null; } else {
      this.mask_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.o2_flowrate = null; } else {
      this.o2_flowrate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ow_conc = null; } else {
      this.ow_conc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.pain_score = null; } else {
      this.pain_score = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pain_score_value = null; } else {
      this.pain_score_value = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nausea = null; } else {
      this.nausea = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.vomiting = null; } else {
      this.vomiting = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bowels = null; } else {
      this.bowels = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bowels_value = null; } else {
      this.bowels_value = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.height = null; } else {
      this.height = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.painheight_value_score = null; } else {
      this.painheight_value_score = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.weight = null; } else {
      this.weight = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.weight_value = null; } else {
      this.weight_value = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.time_started_obs = null; } else {
      this.time_started_obs = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.time_submitted = null; } else {
      this.time_submitted = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    NEWS o = (NEWS) super.clone();
    o.discharge_date = (o.discharge_date != null) ? (java.sql.Date) o.discharge_date.clone() : null;
    o.admission_date = (o.admission_date != null) ? (java.sql.Date) o.admission_date.clone() : null;
    o.time_of_reading = (o.time_of_reading != null) ? (java.sql.Date) o.time_of_reading.clone() : null;
    return o;
  }

  public void clone0(NEWS o) throws CloneNotSupportedException {
    o.discharge_date = (o.discharge_date != null) ? (java.sql.Date) o.discharge_date.clone() : null;
    o.admission_date = (o.admission_date != null) ? (java.sql.Date) o.admission_date.clone() : null;
    o.time_of_reading = (o.time_of_reading != null) ? (java.sql.Date) o.time_of_reading.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("datapacket_id", this.datapacket_id);
    __sqoop$field_map.put("admission_type_code", this.admission_type_code);
    __sqoop$field_map.put("admission_source_code", this.admission_source_code);
    __sqoop$field_map.put("admission_category_code", this.admission_category_code);
    __sqoop$field_map.put("referrer_code", this.referrer_code);
    __sqoop$field_map.put("discharge_date", this.discharge_date);
    __sqoop$field_map.put("discharge_ward_code", this.discharge_ward_code);
    __sqoop$field_map.put("discharge_consultant_code", this.discharge_consultant_code);
    __sqoop$field_map.put("discharge_method_code", this.discharge_method_code);
    __sqoop$field_map.put("discharge_destination_code", this.discharge_destination_code);
    __sqoop$field_map.put("sex", this.sex);
    __sqoop$field_map.put("site_code", this.site_code);
    __sqoop$field_map.put("ward_code", this.ward_code);
    __sqoop$field_map.put("bay_code", this.bay_code);
    __sqoop$field_map.put("bay_name", this.bay_name);
    __sqoop$field_map.put("bed_number", this.bed_number);
    __sqoop$field_map.put("admission_date", this.admission_date);
    __sqoop$field_map.put("time_of_reading", this.time_of_reading);
    __sqoop$field_map.put("packet_type_code", this.packet_type_code);
    __sqoop$field_map.put("packet_type", this.packet_type);
    __sqoop$field_map.put("ews_score", this.ews_score);
    __sqoop$field_map.put("ews_level_code", this.ews_level_code);
    __sqoop$field_map.put("ews_level", this.ews_level);
    __sqoop$field_map.put("ews_incomplete", this.ews_incomplete);
    __sqoop$field_map.put("ews_incomplete_max", this.ews_incomplete_max);
    __sqoop$field_map.put("pulse", this.pulse);
    __sqoop$field_map.put("pulse_value", this.pulse_value);
    __sqoop$field_map.put("temp", this.temp);
    __sqoop$field_map.put("temp_value", this.temp_value);
    __sqoop$field_map.put("bp_sys", this.bp_sys);
    __sqoop$field_map.put("bp_sys_value", this.bp_sys_value);
    __sqoop$field_map.put("bp_dia", this.bp_dia);
    __sqoop$field_map.put("bp_dia_value", this.bp_dia_value);
    __sqoop$field_map.put("resp_rate", this.resp_rate);
    __sqoop$field_map.put("resp_rate_value", this.resp_rate_value);
    __sqoop$field_map.put("avpu", this.avpu);
    __sqoop$field_map.put("o2_sats", this.o2_sats);
    __sqoop$field_map.put("o2_sats_value", this.o2_sats_value);
    __sqoop$field_map.put("mask_type", this.mask_type);
    __sqoop$field_map.put("o2_flowrate", this.o2_flowrate);
    __sqoop$field_map.put("ow_conc", this.ow_conc);
    __sqoop$field_map.put("pain_score", this.pain_score);
    __sqoop$field_map.put("pain_score_value", this.pain_score_value);
    __sqoop$field_map.put("nausea", this.nausea);
    __sqoop$field_map.put("vomiting", this.vomiting);
    __sqoop$field_map.put("bowels", this.bowels);
    __sqoop$field_map.put("bowels_value", this.bowels_value);
    __sqoop$field_map.put("height", this.height);
    __sqoop$field_map.put("painheight_value_score", this.painheight_value_score);
    __sqoop$field_map.put("weight", this.weight);
    __sqoop$field_map.put("weight_value", this.weight_value);
    __sqoop$field_map.put("time_started_obs", this.time_started_obs);
    __sqoop$field_map.put("time_submitted", this.time_submitted);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("datapacket_id", this.datapacket_id);
    __sqoop$field_map.put("admission_type_code", this.admission_type_code);
    __sqoop$field_map.put("admission_source_code", this.admission_source_code);
    __sqoop$field_map.put("admission_category_code", this.admission_category_code);
    __sqoop$field_map.put("referrer_code", this.referrer_code);
    __sqoop$field_map.put("discharge_date", this.discharge_date);
    __sqoop$field_map.put("discharge_ward_code", this.discharge_ward_code);
    __sqoop$field_map.put("discharge_consultant_code", this.discharge_consultant_code);
    __sqoop$field_map.put("discharge_method_code", this.discharge_method_code);
    __sqoop$field_map.put("discharge_destination_code", this.discharge_destination_code);
    __sqoop$field_map.put("sex", this.sex);
    __sqoop$field_map.put("site_code", this.site_code);
    __sqoop$field_map.put("ward_code", this.ward_code);
    __sqoop$field_map.put("bay_code", this.bay_code);
    __sqoop$field_map.put("bay_name", this.bay_name);
    __sqoop$field_map.put("bed_number", this.bed_number);
    __sqoop$field_map.put("admission_date", this.admission_date);
    __sqoop$field_map.put("time_of_reading", this.time_of_reading);
    __sqoop$field_map.put("packet_type_code", this.packet_type_code);
    __sqoop$field_map.put("packet_type", this.packet_type);
    __sqoop$field_map.put("ews_score", this.ews_score);
    __sqoop$field_map.put("ews_level_code", this.ews_level_code);
    __sqoop$field_map.put("ews_level", this.ews_level);
    __sqoop$field_map.put("ews_incomplete", this.ews_incomplete);
    __sqoop$field_map.put("ews_incomplete_max", this.ews_incomplete_max);
    __sqoop$field_map.put("pulse", this.pulse);
    __sqoop$field_map.put("pulse_value", this.pulse_value);
    __sqoop$field_map.put("temp", this.temp);
    __sqoop$field_map.put("temp_value", this.temp_value);
    __sqoop$field_map.put("bp_sys", this.bp_sys);
    __sqoop$field_map.put("bp_sys_value", this.bp_sys_value);
    __sqoop$field_map.put("bp_dia", this.bp_dia);
    __sqoop$field_map.put("bp_dia_value", this.bp_dia_value);
    __sqoop$field_map.put("resp_rate", this.resp_rate);
    __sqoop$field_map.put("resp_rate_value", this.resp_rate_value);
    __sqoop$field_map.put("avpu", this.avpu);
    __sqoop$field_map.put("o2_sats", this.o2_sats);
    __sqoop$field_map.put("o2_sats_value", this.o2_sats_value);
    __sqoop$field_map.put("mask_type", this.mask_type);
    __sqoop$field_map.put("o2_flowrate", this.o2_flowrate);
    __sqoop$field_map.put("ow_conc", this.ow_conc);
    __sqoop$field_map.put("pain_score", this.pain_score);
    __sqoop$field_map.put("pain_score_value", this.pain_score_value);
    __sqoop$field_map.put("nausea", this.nausea);
    __sqoop$field_map.put("vomiting", this.vomiting);
    __sqoop$field_map.put("bowels", this.bowels);
    __sqoop$field_map.put("bowels_value", this.bowels_value);
    __sqoop$field_map.put("height", this.height);
    __sqoop$field_map.put("painheight_value_score", this.painheight_value_score);
    __sqoop$field_map.put("weight", this.weight);
    __sqoop$field_map.put("weight_value", this.weight_value);
    __sqoop$field_map.put("time_started_obs", this.time_started_obs);
    __sqoop$field_map.put("time_submitted", this.time_submitted);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
