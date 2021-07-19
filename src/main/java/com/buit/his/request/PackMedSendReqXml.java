package com.buit.his.request;

import java.io.Serializable;

/**
 * Created by sg on 2021/4/13.
 * 包药推送处方请求
 */
public class PackMedSendReqXml implements Serializable {
    private static final long serialVersionUID = -1405788706727503853L;
    private String packing_res_no;          //推送时间 推送时间YYYYMMDDhhmmss
    private String prescription_date_time;  //开嘱时间YYYY-MM-DD hh:mm:ss
    private String prescription_type_code;  //处方划分 1:长期、2:临时
    private String prescription_type_name;  //长期/临时
    private String single_title;            //发药单号 用于辨别病区/科室单位的摆药单
    private String ward_code;               //病区代码
    private String ward_name;               //病区名称
    private String ward_name_pinyin;        //病区拼音名
    private String clinic_code;             //科室代码
    private String clinic_name;             //科室名称
    private String clinic_name_pinyin;      //科室拼音名
    private String prescription_qrcode;     //处方QR码(暂不填)
    private String patient_code;            //患者ID号
    private String patient_qrcode;          //患者QR码(暂不填)
    private String inpatient_code;          //患者住院号
    private String patient_name;            //患者姓名
    private String gender_type;             //患者性别0:不明、1:男、2:女
    private String birth_date;              //出生日期 格式:YYYY-MM-DD
    private String inpatient_bed_code;      //床位编号
    private String inpatient_bed_name;      //床位名称
    private String patient_address;         //患者住址(暂不填)
    private String doctor_serial_code;      //医生指导编号(暂不填)
    private Integer rp_no;                   //序号 对每处方内给予每条医嘱从1开始的序号
    private String medicine_code;           //药品编码 HIS药品编码
    private String medicine_host_code;      //药品HIS编码(暂不填) 上位系统药品HIS编码
    private String medicine_serial_code;    //药品序号(暂不填) 同一药品RP编号不同，序号不同
    private String medicine_name;           //药品名称
    private String medicine_name_pinyin;    //药品拼音名
    private String take_type;               //服用划分 1:内服（所有口服药默认为1）
    private String medicine_form_code;      //剂型代码 01:片剂、04:胶囊、N2:非分包药品
    private String medicine_form_name;      //剂型名称
    private String youhou_code;             //服用频率 TID、BID、QD、QN等
    private String youhou_name;             //服用频率名称 TID:16-08-12
    private String division_1day;           //服用顿数 根据频次对应时间确定服用顿数
    private String input_quantity;          //每顿服用药品数量 单种药品服用数量/顿 例:1.5、0.5、2、1
    private String input_unit_code;         //摆药单位编号
    private String input_unit_name;         //摆药单位名称 片、粒等
    private String medicine_standard;       //药品规格名称 药品拆零后最小规格单位
    private String firm_id;                 //厂家编号
    private String firm_name;               //厂家名称
    private String rack_no;                 //药架编号
    private String lot_no;                  //LOT编号(暂不填)
    private String expiration_date;         //有效期限 格式：YYYYMMDD到该月的末日有效期限内。
    private String dispense_days;           //摆药天数 1：默认单天包药 多天摆药根据实际天数。
    private String dispense_start_date;     //摆药开始时间 格式：YYYY-MM-DD hh:mm:ss 推送给摆药机的时间
    private String dispensed_total_dose;    //摆药总量 摆药总量=单次服用药品数量*服用顿数*天数
    private String jiten_time01;            //服用时间1 格式：YYYY-MM-DD HH:MI  临时医嘱：设定固定时间并与长期医嘱时间进行区别。
    private String jiten_comment;           //备注 若『服用时间』与『用药说明』是一致，但『备注』内容却不一致时包在不同的药袋
    private String jiten_qrcode;            //医嘱执行序号(暂不填)
    private String usage;                   //用法
    private String base_once;               //药品基本量 药品规格剂量值
    private String dose_once;               //单次服用剂量 药品单次服用剂量值
    private String dose_units;              //单次服用剂量单位 药品单次服用剂量单位
    private String package_num;             //包装数量 包装内的药品数量
    private String apply_num;               //发药数量

    public String getPacking_res_no() {
        return packing_res_no;
    }
    public void setPacking_res_no(String packing_res_no) {
        this.packing_res_no = packing_res_no;
    }

    public String getPrescription_date_time() {
        return prescription_date_time;
    }
    public void setPrescription_date_time(String prescription_date_time) {
        this.prescription_date_time = prescription_date_time;
    }

    public String getPrescription_type_code() {
        return prescription_type_code;
    }
    public void setPrescription_type_code(String prescription_type_code) {
        this.prescription_type_code = prescription_type_code;
    }

    public String getPrescription_type_name() {
        return prescription_type_name;
    }
    public void setPrescription_type_name(String prescription_type_name) {
        this.prescription_type_name = prescription_type_name;
    }

    public String getSingle_title() {
        return single_title;
    }

    public void setSingle_title(String single_title) {
        this.single_title = single_title;
    }

    public String getWard_code() {
        return ward_code;
    }

    public void setWard_code(String ward_code) {
        this.ward_code = ward_code;
    }

    public String getWard_name() {
        return ward_name;
    }

    public void setWard_name(String ward_name) {
        this.ward_name = ward_name;
    }

    public String getWard_name_pinyin() {
        return ward_name_pinyin;
    }

    public void setWard_name_pinyin(String ward_name_pinyin) {
        this.ward_name_pinyin = ward_name_pinyin;
    }

    public String getClinic_code() {
        return clinic_code;
    }

    public void setClinic_code(String clinic_code) {
        this.clinic_code = clinic_code;
    }

    public String getClinic_name() {
        return clinic_name;
    }

    public void setClinic_name(String clinic_name) {
        this.clinic_name = clinic_name;
    }

    public String getClinic_name_pinyin() {
        return clinic_name_pinyin;
    }

    public void setClinic_name_pinyin(String clinic_name_pinyin) {
        this.clinic_name_pinyin = clinic_name_pinyin;
    }

    public String getPrescription_qrcode() {
        return prescription_qrcode;
    }

    public void setPrescription_qrcode(String prescription_qrcode) {
        this.prescription_qrcode = prescription_qrcode;
    }

    public String getPatient_code() {
        return patient_code;
    }

    public void setPatient_code(String patient_code) {
        this.patient_code = patient_code;
    }

    public String getPatient_qrcode() {
        return patient_qrcode;
    }

    public void setPatient_qrcode(String patient_qrcode) {
        this.patient_qrcode = patient_qrcode;
    }

    public String getInpatient_code() {
        return inpatient_code;
    }

    public void setInpatient_code(String inpatient_code) {
        this.inpatient_code = inpatient_code;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getGender_type() {
        return gender_type;
    }

    public void setGender_type(String gender_type) {
        this.gender_type = gender_type;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getInpatient_bed_code() {
        return inpatient_bed_code;
    }

    public void setInpatient_bed_code(String inpatient_bed_code) {
        this.inpatient_bed_code = inpatient_bed_code;
    }

    public String getInpatient_bed_name() {
        return inpatient_bed_name;
    }

    public void setInpatient_bed_name(String inpatient_bed_name) {
        this.inpatient_bed_name = inpatient_bed_name;
    }

    public String getPatient_address() {
        return patient_address;
    }

    public void setPatient_address(String patient_address) {
        this.patient_address = patient_address;
    }

    public String getDoctor_serial_code() {
        return doctor_serial_code;
    }

    public void setDoctor_serial_code(String doctor_serial_code) {
        this.doctor_serial_code = doctor_serial_code;
    }

    public Integer getRp_no() {
        return rp_no;
    }

    public void setRp_no(Integer rp_no) {
        this.rp_no = rp_no;
    }

    public String getMedicine_code() {
        return medicine_code;
    }

    public void setMedicine_code(String medicine_code) {
        this.medicine_code = medicine_code;
    }

    public String getMedicine_host_code() {
        return medicine_host_code;
    }

    public void setMedicine_host_code(String medicine_host_code) {
        this.medicine_host_code = medicine_host_code;
    }

    public String getMedicine_serial_code() {
        return medicine_serial_code;
    }

    public void setMedicine_serial_code(String medicine_serial_code) {
        this.medicine_serial_code = medicine_serial_code;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getMedicine_name_pinyin() {
        return medicine_name_pinyin;
    }

    public void setMedicine_name_pinyin(String medicine_name_pinyin) {
        this.medicine_name_pinyin = medicine_name_pinyin;
    }

    public String getTake_type() {
        return take_type;
    }

    public void setTake_type(String take_type) {
        this.take_type = take_type;
    }

    public String getMedicine_form_code() {
        return medicine_form_code;
    }

    public void setMedicine_form_code(String medicine_form_code) {
        this.medicine_form_code = medicine_form_code;
    }

    public String getMedicine_form_name() {
        return medicine_form_name;
    }

    public void setMedicine_form_name(String medicine_form_name) {
        this.medicine_form_name = medicine_form_name;
    }

    public String getYouhou_code() {
        return youhou_code;
    }

    public void setYouhou_code(String youhou_code) {
        this.youhou_code = youhou_code;
    }

    public String getYouhou_name() {
        return youhou_name;
    }

    public void setYouhou_name(String youhou_name) {
        this.youhou_name = youhou_name;
    }

    public String getDivision_1day() {
        return division_1day;
    }

    public void setDivision_1day(String division_1day) {
        this.division_1day = division_1day;
    }

    public String getInput_quantity() {
        return input_quantity;
    }

    public void setInput_quantity(String input_quantity) {
        this.input_quantity = input_quantity;
    }

    public String getInput_unit_code() {
        return input_unit_code;
    }

    public void setInput_unit_code(String input_unit_code) {
        this.input_unit_code = input_unit_code;
    }

    public String getInput_unit_name() {
        return input_unit_name;
    }

    public void setInput_unit_name(String input_unit_name) {
        this.input_unit_name = input_unit_name;
    }

    public String getMedicine_standard() {
        return medicine_standard;
    }

    public void setMedicine_standard(String medicine_standard) {
        this.medicine_standard = medicine_standard;
    }

    public String getFirm_id() {
        return firm_id;
    }

    public void setFirm_id(String firm_id) {
        this.firm_id = firm_id;
    }

    public String getFirm_name() {
        return firm_name;
    }

    public void setFirm_name(String firm_name) {
        this.firm_name = firm_name;
    }

    public String getRack_no() {
        return rack_no;
    }

    public void setRack_no(String rack_no) {
        this.rack_no = rack_no;
    }

    public String getLot_no() {
        return lot_no;
    }

    public void setLot_no(String lot_no) {
        this.lot_no = lot_no;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getDispense_days() {
        return dispense_days;
    }

    public void setDispense_days(String dispense_days) {
        this.dispense_days = dispense_days;
    }

    public String getDispense_start_date() {
        return dispense_start_date;
    }

    public void setDispense_start_date(String dispense_start_date) {
        this.dispense_start_date = dispense_start_date;
    }

    public String getDispensed_total_dose() {
        return dispensed_total_dose;
    }

    public void setDispensed_total_dose(String dispensed_total_dose) {
        this.dispensed_total_dose = dispensed_total_dose;
    }

    public String getJiten_time01() {
        return jiten_time01;
    }

    public void setJiten_time01(String jiten_time01) {
        this.jiten_time01 = jiten_time01;
    }

    public String getJiten_comment() {
        return jiten_comment;
    }

    public void setJiten_comment(String jiten_comment) {
        this.jiten_comment = jiten_comment;
    }

    public String getJiten_qrcode() {
        return jiten_qrcode;
    }

    public void setJiten_qrcode(String jiten_qrcode) {
        this.jiten_qrcode = jiten_qrcode;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getBase_once() {
        return base_once;
    }

    public void setBase_once(String base_once) {
        this.base_once = base_once;
    }

    public String getDose_once() {
        return dose_once;
    }

    public void setDose_once(String dose_once) {
        this.dose_once = dose_once;
    }

    public String getDose_units() {
        return dose_units;
    }

    public void setDose_units(String dose_units) {
        this.dose_units = dose_units;
    }

    public String getPackage_num() {
        return package_num;
    }

    public void setPackage_num(String package_num) {
        this.package_num = package_num;
    }

    public String getApply_num() {
        return apply_num;
    }

    public void setApply_num(String apply_num) {
        this.apply_num = apply_num;
    }
}
