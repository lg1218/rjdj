/*
SQLyog Professional v12.08 (64 bit)
MySQL - 5.5.60 : Database - houtai
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`houtai` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `houtai`;

/*Table structure for table `billnot_purchase_requisitions` */

DROP TABLE IF EXISTS `billnot_purchase_requisitions`;

CREATE TABLE `billnot_purchase_requisitions` (
  `billno` varchar(20) NOT NULL COMMENT '单据号码',
  `billdate` date DEFAULT NULL COMMENT '单据日期',
  `billstyleid` int(11) DEFAULT NULL COMMENT '采购请购类型',
  `billstatus` int(11) DEFAULT NULL COMMENT '单况',
  `salesid` int(11) DEFAULT NULL COMMENT '请购人员',
  `departid` int(11) DEFAULT NULL COMMENT '请购部门',
  `maker` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(50) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(50) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(100) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(100) DEFAULT NULL COMMENT '备用5',
  PRIMARY KEY (`billno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购请购表';

/*Data for the table `billnot_purchase_requisitions` */

/*Table structure for table `c_payforcontent` */

DROP TABLE IF EXISTS `c_payforcontent`;

CREATE TABLE `c_payforcontent` (
  `rows` double DEFAULT NULL COMMENT '栏号',
  `id` varchar(11) DEFAULT NULL COMMENT '应付冲款单号',
  `notype` varchar(11) DEFAULT NULL COMMENT '原单日期',
  `date` date DEFAULT NULL COMMENT '原单单号',
  `cmd_id` varchar(11) DEFAULT NULL COMMENT '原单金额',
  `originmoney` double DEFAULT NULL COMMENT '现行余额',
  `balance` double DEFAULT NULL COMMENT '折让金额',
  `discountmoney` double DEFAULT NULL COMMENT '冲款金额',
  `payformoney` double DEFAULT NULL COMMENT '取用预付',
  `takeprepay` double DEFAULT NULL COMMENT '备用列',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark2` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark3` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark4` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark5` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark6` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark7` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark8` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark9` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark10` varchar(255) DEFAULT NULL COMMENT '备用列'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `c_payforcontent` */

/*Table structure for table `ca_xiaoshou` */

DROP TABLE IF EXISTS `ca_xiaoshou`;

CREATE TABLE `ca_xiaoshou` (
  `Ca_id` varchar(11) NOT NULL COMMENT '单据号码',
  `Ca_clientId` varchar(11) NOT NULL COMMENT '客户编号(引用客户表的主键)',
  `Ca_clientName` varchar(20) DEFAULT NULL COMMENT '物料表外键',
  `Ca_containTax` int(8) DEFAULT NULL COMMENT '单价是否含税',
  `Ca moneyType` varchar(20) DEFAULT NULL COMMENT '币别',
  `Ca_ins torageName` varchar(50) DEFAULT NULL COMMENT '退货仓库名称',
  `Ca_ins torageId` varchar(5) DEFAULT NULL COMMENT '仓库id(引用仓库表的主键）',
  `Ca_rate` double DEFAULT NULL COMMENT '汇率',
  `Ca_afreshInstorage` int(2) DEFAULT NULL COMMENT '重新入库是不是',
  `Ca_date` date DEFAULT NULL COMMENT '|服务器当前时间单据日期',
  `Ca_moneyAttach` varchar(50) DEFAULT NULL COMMENT ' 账款归属',
  `Ca_moneyTerm` varchar(50) DEFAULT NULL COMMENT '默认(货到，次月，收款条件月结，其他)',
  `Ca_moneyMonth` date DEFAULT NULL COMMENT '收款月份',
  `Ca_largess` int(2) DEFAULT NULL COMMENT '是不是|赠品',
  `Ca_remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `Ca_operationPerson` varchar(20) DEFAULT NULL COMMENT '业务人员',
  `Ca_opId` varchar(5) DEFAULT NULL COMMENT '业务人员id',
  `Ca_checkPerson` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `Ca_chId` varchar(5) DEFAULT NULL COMMENT '复核人员id',
  `Ca_makePerson` varchar(20) DEFAULT NULL COMMENT '制单人员 .',
  `Ca_mpId` varchar(5) DEFAULT NULL COMMENT '| 制单人员id',
  `Ca_dept` varchar(20) DEFAULT NULL COMMENT '所属部门',
  `Ca_deptId` varchar(5) DEFAULT NULL COMMENT '部门id',
  `Ca_item` varchar(20) DEFAULT NULL COMMENT '所属项目',
  `Ca_itemId` varchar(20) DEFAULT NULL COMMENT '所属项目id',
  `Ca_state` int(2) DEFAULT NULL COMMENT '审核',
  `Ca_byzd1` varchar(30) DEFAULT NULL COMMENT '备注列1',
  `Ca_byzd2` varchar(30) DEFAULT NULL COMMENT '备注列2',
  `Ca_byzd3` varchar(30) DEFAULT NULL COMMENT '备注列3',
  `Ca_byzd4` varchar(30) DEFAULT NULL COMMENT '备注列4',
  `Ca_byzd5` varchar(30) DEFAULT NULL COMMENT '备注列5',
  PRIMARY KEY (`Ca_id`,`Ca_clientId`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `ca_xiaoshou` */

/*Table structure for table `cgft` */

DROP TABLE IF EXISTS `cgft`;

CREATE TABLE `cgft` (
  `cgftid` varchar(20) NOT NULL COMMENT '采购分摊单据编号',
  `date` date DEFAULT NULL COMMENT '单据日期',
  `cgftpzbh` varchar(50) DEFAULT NULL COMMENT '凭证编号',
  `cgftfs` int(4) DEFAULT NULL COMMENT '分摊方式0按金额1按数量',
  `cgftbwb` double DEFAULT NULL COMMENT '待摊金额本位币',
  `cgftzd` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `cgftfh` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `cgftby1` varchar(50) DEFAULT NULL COMMENT '备用1',
  `cgftby2` varchar(50) DEFAULT NULL COMMENT '备用2',
  `cgftby3` varchar(50) DEFAULT NULL COMMENT '备用3',
  `cgftzt` int(4) DEFAULT NULL COMMENT '审核状态0不是1是',
  PRIMARY KEY (`cgftid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `cgft` */

/*Table structure for table `cgftmx` */

DROP TABLE IF EXISTS `cgftmx`;

CREATE TABLE `cgftmx` (
  `cgftid` varchar(20) DEFAULT NULL COMMENT '采购分摊单据编号',
  `cgftmxid` int(11) NOT NULL AUTO_INCREMENT COMMENT '采购费用分摊明细ID',
  `cgftmxfyid` int(11) DEFAULT NULL COMMENT '费用编号id关联',
  `cgftmxfyname` varchar(50) DEFAULT NULL COMMENT '费用名称',
  `cgftmxbb` varchar(20) DEFAULT NULL COMMENT '币别',
  `cgftmxhl` varchar(20) DEFAULT NULL COMMENT '汇率',
  `cgftmxje` double DEFAULT NULL COMMENT '金额',
  `cgftmxjebw` varchar(20) DEFAULT NULL COMMENT '金额本位币',
  `cgftmxby1` varchar(200) DEFAULT NULL COMMENT '备用1',
  `cgftmxby2` varchar(200) DEFAULT NULL COMMENT '备用2',
  `cgftmxby3` varchar(200) DEFAULT NULL COMMENT '备用3',
  PRIMARY KEY (`cgftmxid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `cgftmx` */

/*Table structure for table `db` */

DROP TABLE IF EXISTS `db`;

CREATE TABLE `db` (
  `dbid` varchar(11) NOT NULL COMMENT '单据号码',
  `dbdate` date DEFAULT NULL COMMENT '单据日期',
  `dbdiaoru` int(10) DEFAULT NULL COMMENT '调入仓库id',
  `dbdiaochu` int(10) DEFAULT NULL COMMENT '调出仓库id',
  `dbzd` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `dbfh` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `dbbeizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `dbby1` varchar(50) DEFAULT NULL COMMENT '备用1',
  `dbby2` varchar(50) DEFAULT NULL COMMENT '备用2',
  `dbby3` varchar(50) DEFAULT NULL COMMENT '备用3',
  `dbzt` int(4) DEFAULT NULL COMMENT '审核状态0不是1是',
  PRIMARY KEY (`dbid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `db` */

/*Table structure for table `dbmx` */

DROP TABLE IF EXISTS `dbmx`;

CREATE TABLE `dbmx` (
  `dbmxid` int(11) NOT NULL AUTO_INCREMENT COMMENT '调拨明细id',
  `dbid` varchar(50) DEFAULT NULL COMMENT '调拨单单据号码',
  `entifierid` varchar(50) DEFAULT NULL COMMENT '物料编号id',
  `dbmxwlname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `dbmxggxh` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `dbmxdw` varchar(50) DEFAULT NULL COMMENT '单位',
  `dbmxsl` int(11) DEFAULT NULL COMMENT '调拨数量',
  `dbmxph` varchar(50) DEFAULT NULL COMMENT '批号',
  `dbmxflbz` varchar(200) DEFAULT NULL COMMENT '备注',
  `dbmxby1` varchar(50) DEFAULT NULL COMMENT '备用1',
  `dbmxby2` varchar(200) DEFAULT NULL COMMENT '备用2',
  `dbmxby3` varchar(200) DEFAULT NULL COMMENT '备用3',
  `dbmxdbzt` int(4) DEFAULT NULL COMMENT '审核0不是1是',
  PRIMARY KEY (`dbmxid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `dbmx` */

/*Table structure for table `in_out_warehouse` */

DROP TABLE IF EXISTS `in_out_warehouse`;

CREATE TABLE `in_out_warehouse` (
  `iow_type_id` int(11) NOT NULL COMMENT '单据类型',
  `iow_id` varchar(50) DEFAULT NULL COMMENT '单据编号',
  `iow_lineid` int(11) DEFAULT NULL COMMENT '出入库行号',
  `iow_w_id` int(11) DEFAULT NULL COMMENT '仓库编号',
  `iow_num` int(11) DEFAULT NULL COMMENT '数量（-，+）',
  `iow_cbdprice` double DEFAULT NULL COMMENT '成本单价',
  `iow_totalmoney` double DEFAULT NULL COMMENT '总金额',
  `tow_iom_date` date DEFAULT NULL COMMENT '出入库的时间',
  `bz1` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz2` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz10` varchar(50) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`iow_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `in_out_warehouse` */

/*Table structure for table `in_stock_total` */

DROP TABLE IF EXISTS `in_stock_total`;

CREATE TABLE `in_stock_total` (
  `ist_id` int(11) NOT NULL COMMENT '仓库编号',
  `ist_mm_id` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `ist_num` int(11) DEFAULT NULL COMMENT '数量',
  `ist_dprice` double DEFAULT NULL COMMENT '单价：（成本）',
  `ist_totalMoney` double DEFAULT NULL COMMENT '金额',
  `ist_mm_anqnum` int(11) DEFAULT NULL COMMENT '安全存量',
  `ist_mm_start_totalnum` int(11) DEFAULT NULL COMMENT '期初总数量',
  `ist_mm_start_pjcprice` double DEFAULT NULL COMMENT '期初平均成本',
  `Ist_mm_start_bb_pjcprice` double DEFAULT NULL COMMENT '期初标准成本',
  `Ist_mm_start_totalcprice` double DEFAULT NULL COMMENT '期初总成本',
  `Ist_mm_dy_anqcun` int(11) DEFAULT NULL COMMENT '低于安全存量',
  `Ist_mm_now_totalnum` int(11) DEFAULT NULL COMMENT '现有总数量',
  `Ist_mm_now_pccprice` double DEFAULT NULL COMMENT '现行平均成本',
  `Ist_mm_now_bztotalcb` double DEFAULT NULL COMMENT '现行标准总成本',
  `Ist_mm_now_totalcb` double DEFAULT NULL COMMENT '现行总成本',
  `bz1` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz2` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz10` varchar(50) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`ist_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `in_stock_total` */

/*Table structure for table `k_store_adjustpriecedetail` */

DROP TABLE IF EXISTS `k_store_adjustpriecedetail`;

CREATE TABLE `k_store_adjustpriecedetail` (
  `ap_id` int(9) NOT NULL COMMENT '栏号',
  `apd_mm_id` date DEFAULT NULL COMMENT '物料编号',
  `apd_proname` varchar(50) DEFAULT NULL COMMENT '物品名称',
  `apd_standardtype` int(9) DEFAULT NULL COMMENT '规格型号',
  `apd_unit` varchar(9) DEFAULT NULL COMMENT '单位',
  `apd_amount` int(9) DEFAULT NULL COMMENT '库存量',
  `apd_meancost` double DEFAULT NULL COMMENT '平均成本',
  `apd_price` double DEFAULT NULL COMMENT '单价',
  `apd_money` double DEFAULT NULL COMMENT '调价金额',
  `apd_remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `apd_By1` varchar(200) DEFAULT NULL COMMENT '备用字段1',
  `apd_By2` varchar(200) DEFAULT NULL COMMENT '备用字段2',
  PRIMARY KEY (`ap_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `k_store_adjustpriecedetail` */

/*Table structure for table `kehu_address` */

DROP TABLE IF EXISTS `kehu_address`;

CREATE TABLE `kehu_address` (
  `kud_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '给客户引用地区编号',
  `kud_name` varchar(20) DEFAULT NULL COMMENT '地区名称',
  `kud_ename` varchar(20) DEFAULT NULL COMMENT '英文名称',
  `kud_remark` varchar(20) DEFAULT NULL COMMENT '备注',
  `kud_Bz1` varchar(20) DEFAULT NULL COMMENT '备用',
  `kud_Bz2` varchar(20) DEFAULT NULL COMMENT '备用',
  `bz3` varchar(20) DEFAULT NULL COMMENT '备用',
  PRIMARY KEY (`kud_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `kehu_address` */

/*Table structure for table `kehu_address_details` */

DROP TABLE IF EXISTS `kehu_address_details`;

CREATE TABLE `kehu_address_details` (
  `kud_d_sad_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号自己写地址编号',
  `kud_d_smid` int(20) DEFAULT NULL COMMENT '对应的客户供应商编号',
  `kud_d_address` varchar(20) DEFAULT NULL COMMENT '地址内容地址',
  `kud_d_email` varchar(20) DEFAULT NULL COMMENT '邮政编号',
  `kud_d_lx_man` varchar(20) DEFAULT NULL COMMENT '联系人',
  `kud_d_lx_lx` varchar(20) DEFAULT NULL COMMENT '联系人职称',
  `kud_d_lx_phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `kud_d_cz_num` varchar(20) DEFAULT NULL COMMENT '传真号码',
  `kud_d_runway` varchar(20) DEFAULT NULL COMMENT '行走路线',
  `kud_d_remark` varchar(20) DEFAULT NULL COMMENT '备注',
  `kud_d_Bz1` varchar(20) DEFAULT NULL COMMENT '备YOMG',
  `kud_d_Bz2` varchar(20) DEFAULT NULL COMMENT '备YOMG',
  `kud_d_Bz3` varchar(20) DEFAULT NULL COMMENT '备YOMG',
  PRIMARY KEY (`kud_d_sad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `kehu_address_details` */

/*Table structure for table `kehu_main` */

DROP TABLE IF EXISTS `kehu_main`;

CREATE TABLE `kehu_main` (
  `khid` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增的客户编号 客户编号(',
  `khfname` varchar(40) DEFAULT NULL COMMENT '客户全称',
  `khsname` varchar(20) DEFAULT NULL COMMENT '客户简称',
  `khefname` varchar(80) DEFAULT NULL COMMENT '英文全称',
  `khssname` varchar(40) DEFAULT NULL COMMENT '英文简称',
  `khavid` int(20) DEFAULT NULL COMMENT '归属编号也是客户编号账款归属编号',
  `khtypeid` int(20) DEFAULT NULL COMMENT '客户的类型类别编号',
  `khAreaid` int(20) DEFAULT NULL COMMENT '地区地区编号',
  `khCurrencyid` int(20) DEFAULT NULL COMMENT '币别币别编号',
  `kh_fz_man` varchar(20) DEFAULT NULL COMMENT '负责人',
  `kh_lx_man` varchar(20) DEFAULT NULL COMMENT '联系人',
  `kh_lx_phoneone` varchar(20) DEFAULT NULL COMMENT '联系电话1',
  `kh_lx_phonetwo` varchar(20) DEFAULT NULL COMMENT '联系电话2',
  `kh_lx_phonethree` varchar(20) DEFAULT NULL COMMENT '联系电话3',
  `kh_lx_phone_mobile` varchar(20) DEFAULT NULL COMMENT '移动电话',
  `kh_yh_numu` varchar(20) DEFAULT NULL COMMENT '银行账号',
  `kh_yh_num` int(20) DEFAULT NULL COMMENT '开户银行编号  来自银行表开户银行编号',
  `kh_xs_man_id` int(20) DEFAULT NULL COMMENT '对应的员工销售人员编号',
  `kh_sw_nums` varchar(20) DEFAULT NULL COMMENT '税务登记号',
  `kh_zb_money` double DEFAULT NULL COMMENT '资本额',
  `kh_hy_type` varchar(20) DEFAULT NULL COMMENT '行业别',
  `kh_e_mail` varchar(20) DEFAULT NULL COMMENT '电子邮件',
  `kh_intel_address` varchar(20) DEFAULT NULL COMMENT '网址',
  `kh_cz_num` varchar(20) DEFAULT NULL COMMENT '传真号码',
  `kh_startcg_rk_date` date DEFAULT NULL COMMENT '这些都是后续要更新的内容最初销售出库日',
  `kh_startcg_th_date` date DEFAULT NULL COMMENT '最初销售退货日',
  `kh_nearcg_rk_date` date DEFAULT NULL COMMENT '最近销售出库日',
  `kh_nearcg_th_date` date DEFAULT NULL COMMENT '最近销售退货日',
  `kh_price_hs_bl` tinyint(1) DEFAULT NULL COMMENT '单价是否含税',
  `kh_end_jy_date` date DEFAULT NULL COMMENT '终止交易日',
  `kh_zk_totalmoney` double DEFAULT NULL COMMENT '账款额度',
  `kh_sy_money` double DEFAULT NULL COMMENT '剩余额度',
  `kh_fk_where` int(20) DEFAULT NULL COMMENT '收款条件',
  `kh_where_day` int(20) DEFAULT NULL COMMENT '条件天数',
  `kh_month_jz_date` date DEFAULT NULL COMMENT '每月结账日',
  `kh_xy_level` int(20) DEFAULT NULL COMMENT '信用等级',
  `kh_fp_typeid` int(20) DEFAULT NULL COMMENT '发票类型',
  `kh_start_yinf_money` double DEFAULT NULL COMMENT '期初预付款',
  `kh_start_yuf_money` double DEFAULT NULL COMMENT '期初应收款',
  `kh_last_yuf_money` double DEFAULT NULL COMMENT '期末预收款',
  `kh_last_yinf_monet` double DEFAULT NULL COMMENT '期末应收款',
  `kh_yufzk_subjectid` int(20) DEFAULT NULL COMMENT '预收账款科目编号',
  `kh_yinfzk_subjectid` int(20) DEFAULT NULL COMMENT '应收账款科目编号',
  `kh_yinfzg_subjectid` int(20) DEFAULT NULL COMMENT '应收暂估科目编号',
  `kh_remark` varchar(20) DEFAULT NULL COMMENT '备注',
  `kh_Bz1` varchar(20) DEFAULT NULL COMMENT '备用',
  `kh_Bz2` varchar(20) DEFAULT NULL COMMENT '备用',
  `kh_Bz3` varchar(20) DEFAULT NULL COMMENT '备用',
  `kh_Bz4` varchar(20) DEFAULT NULL COMMENT '备用',
  `kh_Bz5` varchar(20) DEFAULT NULL COMMENT '备用',
  PRIMARY KEY (`khid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `kehu_main` */

/*Table structure for table `kehu_type` */

DROP TABLE IF EXISTS `kehu_type`;

CREATE TABLE `kehu_type` (
  `kul_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '字母+数字自增类别编号',
  `kul_name` varchar(20) DEFAULT NULL COMMENT '类别名称',
  `kul_ename` varchar(20) DEFAULT NULL COMMENT '英文名称',
  `kul_remark` varchar(20) DEFAULT NULL COMMENT '备注',
  `Kul_Bz1` varchar(20) DEFAULT NULL COMMENT '备用',
  `Kul_Bz2` varchar(20) DEFAULT NULL COMMENT '备用',
  `Kul_Bz3` varchar(20) DEFAULT NULL COMMENT '备用',
  PRIMARY KEY (`kul_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `kehu_type` */

/*Table structure for table `materials_main` */

DROP TABLE IF EXISTS `materials_main`;

CREATE TABLE `materials_main` (
  `mm_id` int(11) NOT NULL COMMENT '物料编号',
  `mm_name` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `mm_xh` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `mm_ename` varchar(50) DEFAULT NULL COMMENT '英文品名',
  `mm_mtid` int(11) DEFAULT NULL COMMENT '物料类别编号',
  `mm_uid` int(11) DEFAULT NULL COMMENT '计量单位编号',
  `mm_txmnum` varchar(50) DEFAULT NULL COMMENT '条形码编号',
  `mm_jyout` double DEFAULT NULL COMMENT '建议售价',
  `mm_jyout_a` double DEFAULT NULL COMMENT '售价A',
  `mm_jyout_b` double DEFAULT NULL COMMENT '售价B',
  `mm_jyout_c` double DEFAULT NULL COMMENT '售价C',
  `mm_jyout_d` double DEFAULT NULL COMMENT '售价D',
  `mm_jyout_e` double DEFAULT NULL COMMENT '售价E',
  `mm_jyout_f` double DEFAULT NULL COMMENT '售价F',
  `mm_bzjj` double DEFAULT NULL COMMENT '标准进价',
  `mm_cid` int(11) DEFAULT NULL COMMENT '使用币别编号',
  `mm_mmxt` int(11) DEFAULT NULL COMMENT '物料形态',
  `mm_dprice_flag` tinyint(1) DEFAULT NULL COMMENT '单价是否含税',
  `mm_tiid` int(11) DEFAULT NULL COMMENT '税目编号',
  `mm_slv` double DEFAULT NULL COMMENT '税率',
  `mm_cgbefore_date` int(11) DEFAULT NULL COMMENT '采购提前期',
  `mm_main_smid` varchar(50) DEFAULT NULL COMMENT '主供应商编号',
  `mm_near_ck_date` date DEFAULT NULL COMMENT '最初出库日',
  `mm_near_rk_date` date DEFAULT NULL COMMENT '最初入库日',
  `mm_dz_days` int(11) DEFAULT NULL COMMENT '呆滞起记天数',
  `mm_jin_ck_date` date DEFAULT NULL COMMENT '最近出库日',
  `mm_stop_date` date DEFAULT NULL COMMENT '停用日期',
  `mm_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz2` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz10` varchar(50) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`mm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `materials_main` */

/*Table structure for table `materials_type` */

DROP TABLE IF EXISTS `materials_type`;

CREATE TABLE `materials_type` (
  `mt_id` varchar(50) DEFAULT NULL COMMENT '类别编号',
  `mt_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `mt_ename` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `mt_hc_subjectid` int(11) DEFAULT NULL COMMENT '存货科目编号',
  `mt_xssr_subjectid` int(11) DEFAULT NULL COMMENT '销售收入科目编号',
  `mt_zpcb_subjectid` int(11) DEFAULT NULL COMMENT '销售成本科目编号',
  `mt_zpfy_subjectid` int(11) DEFAULT NULL COMMENT '赠品费用科目编号',
  `mt_qtsr_subjectid` int(11) DEFAULT NULL COMMENT '其他收入科目编号',
  `mt_qtfy_subjectid` int(11) DEFAULT NULL COMMENT '其他费用科目编号',
  `mt_qtcb_subjectid` int(11) DEFAULT NULL COMMENT '其他成本科目编号',
  `mt_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz2` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz10` varchar(50) DEFAULT NULL COMMENT '备用列'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `materials_type` */

/*Table structure for table `p_check_memu` */

DROP TABLE IF EXISTS `p_check_memu`;

CREATE TABLE `p_check_memu` (
  `me_billno` varchar(20) NOT NULL COMMENT '单剧号码',
  `me_adjustdate` date DEFAULT NULL COMMENT '单据日期',
  `me_wareid` int(9) DEFAULT NULL COMMENT '盘点仓库',
  `me_salesid` int(9) DEFAULT NULL COMMENT '盘点人员',
  `me_maker` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `me_departid` varchar(5) DEFAULT NULL COMMENT '所属部门',
  `me_permitter` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `me_zerofilter` int(9) DEFAULT NULL COMMENT '账面数量为0载入（0未选中，1选中）',
  `byzd1` varchar(200) DEFAULT NULL COMMENT '备用字段1',
  `byzd2` varchar(200) DEFAULT NULL COMMENT '备用字段2',
  `byzd3` varchar(200) DEFAULT NULL COMMENT '备用字段3',
  `byzd4` varchar(200) DEFAULT NULL COMMENT '备用字段4',
  PRIMARY KEY (`me_billno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `p_check_memu` */

/*Table structure for table `p_checkmemu_detail` */

DROP TABLE IF EXISTS `p_checkmemu_detail`;

CREATE TABLE `p_checkmemu_detail` (
  `me_billno` varchar(20) NOT NULL COMMENT '盘点单单号',
  `mp_line_id` int(9) DEFAULT NULL COMMENT '行号',
  `mp_mm_id` date DEFAULT NULL COMMENT '物料编号',
  `mp_prodname` varchar(20) DEFAULT NULL COMMENT '物料名称',
  `mp_prodsize` int(9) DEFAULT NULL COMMENT '规格型号',
  `mp_unit` varchar(20) DEFAULT NULL COMMENT '单位',
  `mp_curqty` int(9) DEFAULT NULL COMMENT '账面数量',
  `mp_checkqty` int(9) DEFAULT NULL COMMENT '盘点数量',
  `mp_quantity` varchar(200) DEFAULT NULL COMMENT '盈亏数量',
  `mp_price` double DEFAULT NULL COMMENT '单价',
  `mp_amount` double DEFAULT NULL COMMENT '盈亏金额',
  `mp_billstatus` int(9) DEFAULT NULL COMMENT '单据状态（0表示否，1表示是）',
  `mp_itemremark` varchar(400) DEFAULT NULL COMMENT '原因',
  `mp_sumcurqty` varchar(20) DEFAULT NULL COMMENT '账面总数量',
  `mp_sumcheckqty` varchar(20) DEFAULT NULL COMMENT '盘点总数量',
  `mp_sumqty` varchar(20) DEFAULT NULL COMMENT '盈亏总数量',
  `mp_sumcost` double DEFAULT NULL COMMENT '盈亏总金额',
  `mp_udef1` varchar(20) DEFAULT NULL COMMENT '自定义1',
  `mp_udef2` varchar(20) DEFAULT NULL COMMENT '自定义2',
  `mp_remark` varchar(20) DEFAULT NULL COMMENT '备注',
  `by1` varchar(200) DEFAULT NULL COMMENT '备用字段1',
  `by2` varchar(200) DEFAULT NULL COMMENT '备用字段2',
  PRIMARY KEY (`me_billno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `p_checkmemu_detail` */

/*Table structure for table `p_r_details` */

DROP TABLE IF EXISTS `p_r_details`;

CREATE TABLE `p_r_details` (
  `prd_lineid` int(11) NOT NULL AUTO_INCREMENT COMMENT '单据详细行号',
  `prd_prmid` int(11) DEFAULT NULL COMMENT '对应的退货主表采购退货编号',
  `prd_mmid` int(11) NOT NULL COMMENT '可重复物料编号',
  `prd_mmname` varchar(50) DEFAULT NULL COMMENT '以下内容全部是连带内容物料名称',
  `prd_mmxh` varchar(20) DEFAULT NULL COMMENT '物料型号',
  `psd_num` int(11) DEFAULT NULL COMMENT '数量',
  `psd_dprice` double DEFAULT NULL COMMENT '折扣前单价',
  `psd_uname` varchar(20) DEFAULT NULL COMMENT '单位',
  `psd_zheshu` double DEFAULT NULL COMMENT '折数',
  `psd_zh_dprice` double DEFAULT NULL COMMENT '折后单价',
  `psd_bhs_totalmoney` double DEFAULT NULL COMMENT '不含税总金额',
  `psd_slv` double DEFAULT NULL COMMENT '税率',
  `psd_shuie` double DEFAULT NULL COMMENT '税额',
  `psd_totalprice` double DEFAULT NULL COMMENT '含税总金额',
  `prd_ly_db` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `prd_ly_dh` varchar(20) DEFAULT NULL COMMENT '转单来源单号',
  `prd_flag_zp` tinyint(1) DEFAULT NULL COMMENT '是否赠品',
  `prd_wkp_num` int(11) DEFAULT NULL COMMENT '未开票数量',
  `prd_remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(100) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(100) DEFAULT NULL COMMENT '备用5',
  PRIMARY KEY (`prd_lineid`,`prd_mmid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购退货详表';

/*Data for the table `p_r_details` */

/*Table structure for table `p_r_main` */

DROP TABLE IF EXISTS `p_r_main`;

CREATE TABLE `p_r_main` (
  `prm_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '单据编号',
  `prm_num` varchar(20) NOT NULL COMMENT '日期流水号单据号码',
  `prm_date` date DEFAULT NULL COMMENT '单据日期',
  `prm_smid` int(11) DEFAULT NULL COMMENT '供应商编号供应商编号',
  `prm_flag_cxrk` tinyint(1) DEFAULT NULL COMMENT '是否重新入库',
  `prm_bb_id` int(11) DEFAULT NULL COMMENT '币别编号币别编号',
  `prm_flag_dprice` tinyint(1) DEFAULT NULL COMMENT '单价是否含税',
  `prm_warehose_id` int(11) DEFAULT NULL COMMENT '那个仓库仓库编号',
  `prm_gywy_flag` tinyint(1) DEFAULT NULL COMMENT '国外贸易是否',
  `prm_pznum` varchar(20) DEFAULT NULL COMMENT '凭证编号',
  `prm_cg_pfmid` int(11) DEFAULT NULL COMMENT '员工采购人员编号',
  `prm_zd_pfmid` int(11) DEFAULT NULL COMMENT '员工制单人员编号',
  `prm_fh_pfmid` int(11) DEFAULT NULL COMMENT '员工复核人员编号',
  `prm_ssproject` int(11) DEFAULT NULL COMMENT '所属项目',
  `prm_zkgs_smid` varchar(20) DEFAULT NULL COMMENT '可选择供应商账款归属编号（供应商）',
  `prm_fkwhere` int(11) DEFAULT NULL COMMENT '付款条件',
  `prm_fkwhere_day` int(11) DEFAULT NULL COMMENT '付款条件天数',
  `prm_fk_date` date DEFAULT NULL COMMENT '付款日期',
  `prm_fk_month` date DEFAULT NULL COMMENT '账款月份',
  `prm_remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `prm_hd_staus` int(11) DEFAULT NULL COMMENT '核对状态',
  `bz1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(100) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(100) DEFAULT NULL COMMENT '备用5',
  PRIMARY KEY (`prm_id`,`prm_num`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购退货主表';

/*Data for the table `p_r_main` */

/*Table structure for table `p_s_details` */

DROP TABLE IF EXISTS `p_s_details`;

CREATE TABLE `p_s_details` (
  `psd_lineid` int(11) NOT NULL AUTO_INCREMENT COMMENT '单据详细行号',
  `psd_psm_id` int(11) DEFAULT NULL COMMENT '对应的入库主id采购入库编号',
  `psd_mm_id` int(11) DEFAULT NULL COMMENT '物料编号可重复物料编号',
  `psd_mmname` varchar(20) DEFAULT NULL COMMENT '物料名称',
  `psd_mmxh` varchar(20) DEFAULT NULL COMMENT '物料型号',
  `psd_num` int(11) DEFAULT NULL COMMENT '数量',
  `psd_dprice` double DEFAULT NULL COMMENT '折扣前单价',
  `psd_uname` varchar(10) DEFAULT NULL COMMENT '单位',
  `psd_zheshu` double DEFAULT NULL COMMENT '折数',
  `psd_zh_dprice` double DEFAULT NULL COMMENT '折后单价',
  `psd_bhs_totalmoney` double DEFAULT NULL COMMENT '不含税总金额',
  `psd_slv` double DEFAULT NULL COMMENT '税率',
  `psd_shuie` double DEFAULT NULL COMMENT '税额',
  `psd_totalprice` double DEFAULT NULL COMMENT '含税总金额',
  `psd_ly_db` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `psd_ly_dh` varchar(20) DEFAULT NULL COMMENT '转单来源单号',
  `psd_flag_zp` tinyint(1) DEFAULT NULL COMMENT '是否赠品',
  `psd_wkp_num` int(11) DEFAULT NULL COMMENT '未开票数量',
  `psd_remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `psd_ft_money` double DEFAULT NULL COMMENT '分摊费用',
  `bz1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(100) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(100) DEFAULT NULL COMMENT '备用5',
  PRIMARY KEY (`psd_lineid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购入库详表';

/*Data for the table `p_s_details` */

/*Table structure for table `p_s_main` */

DROP TABLE IF EXISTS `p_s_main`;

CREATE TABLE `p_s_main` (
  `psm_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '单据编号',
  `psm_num` varchar(20) NOT NULL COMMENT '日期流水号单据号码',
  `psm_date` date DEFAULT NULL COMMENT '单据日期',
  `psm_sm_id` int(11) DEFAULT NULL COMMENT '对应的供应商供应商编号',
  `psm_typeid` int(11) DEFAULT NULL COMMENT '入库的类型采购入库类型',
  `psm_bb_id` int(11) DEFAULT NULL COMMENT '对应的币别币别编号',
  `psm_flaghs` tinyint(1) DEFAULT NULL COMMENT '单价是否含税',
  `psm_ck_id` int(11) DEFAULT NULL COMMENT '到底加入到那个仓库仓库编号',
  `psm_gwmyflag` tinyint(1) DEFAULT NULL COMMENT '国外贸易是否',
  `psm_pznum` varchar(20) DEFAULT NULL COMMENT '凭证编号',
  `psm_cgpfmid` int(11) DEFAULT NULL COMMENT '员工采购人员编号',
  `psm_zdpfmid` int(11) DEFAULT NULL COMMENT '员工制单人员编号',
  `psm_fhpfmid` int(11) DEFAULT NULL COMMENT '员工复核人员编号',
  `psm_ssproject` int(11) DEFAULT NULL COMMENT '项目编号所属项目',
  `psm_zkgs_smid` varchar(20) DEFAULT NULL COMMENT '可选择其他的供应商账款归属编号（供应商）',
  `psm_fkwhere` int(11) DEFAULT NULL COMMENT '付款条件',
  `psm_whereday` int(11) DEFAULT NULL COMMENT '付款条件天数',
  `psm_fk_date` date DEFAULT NULL COMMENT '付款日期',
  `psm_fk_month` date DEFAULT NULL COMMENT '账款月份',
  `psm_remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `psm_hd_status` int(11) DEFAULT NULL COMMENT '核对状态',
  `psm_hs_totalmoney` double DEFAULT NULL COMMENT '含税总金额',
  `psm_noths_totalmoney` double DEFAULT NULL COMMENT '不含税总金额',
  `bz1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(100) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(100) DEFAULT NULL COMMENT '备用5',
  PRIMARY KEY (`psm_id`,`psm_num`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购入库主表';

/*Data for the table `p_s_main` */

/*Table structure for table `q_takeprepay` */

DROP TABLE IF EXISTS `q_takeprepay`;

CREATE TABLE `q_takeprepay` (
  `id` varchar(11) DEFAULT NULL COMMENT '主表单据号',
  `ad_id` varchar(11) DEFAULT NULL COMMENT '应付冲款单号',
  `rows` double DEFAULT NULL COMMENT '来源行号',
  `origintype` varchar(11) DEFAULT NULL COMMENT '来源类别',
  `ordid` varchar(11) DEFAULT NULL COMMENT '来源单号',
  `originmoney` double DEFAULT NULL COMMENT '原单金额',
  `balance` double DEFAULT NULL COMMENT '预付余额',
  `takeprepay` double DEFAULT NULL COMMENT '取用预付金额',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark2` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark3` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark4` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark5` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark6` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark7` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark8` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark9` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark10` varchar(255) DEFAULT NULL COMMENT '备用列'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `q_takeprepay` */

/*Table structure for table `s_sell_cancelparticular` */

DROP TABLE IF EXISTS `s_sell_cancelparticular`;

CREATE TABLE `s_sell_cancelparticular` (
  `cpa_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '(单据号码)',
  `ca_id` varchar(11) NOT NULL COMMENT '|退货单id(引用退货单的主键)',
  `cpa_materielid` varchar(30) DEFAULT NULL COMMENT '物料编号 (引用物料表的主键)',
  `cpa_materielname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `cpa_order` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `cpa_number` varchar(11) DEFAULT NULL COMMENT '来源单号',
  `cpa_beione` varchar(20) DEFAULT NULL COMMENT '备用字段一',
  `cpa_beitwo` varchar(20) DEFAULT NULL COMMENT '备用字段二',
  `cpa_beithree` varchar(20) DEFAULT NULL COMMENT '备用字段三',
  `cpa_state` int(2) DEFAULT NULL COMMENT '状态',
  `cpa_totalcost` double DEFAULT NULL COMMENT '实际成本(该物料的现行平均成本*退 货数量)注:现行平均成本就是该退货单最后一次审核，算好现行平均成本的那个。',
  `cpa_standcost` double DEFAULT NULL COMMENT '|标准成本(该物料的标准成本*退货数量)',
  PRIMARY KEY (`cpa_id`,`ca_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `s_sell_cancelparticular` */

/*Table structure for table `s_sell_out` */

DROP TABLE IF EXISTS `s_sell_out`;

CREATE TABLE `s_sell_out` (
  `ou_number` varchar(11) NOT NULL COMMENT '订单号',
  `ou_data` date DEFAULT NULL COMMENT '单据日期',
  `ou_clientName` varchar(30) DEFAULT NULL COMMENT '客户名称',
  `ou_location` varchar(100) DEFAULT NULL COMMENT '送货地址',
  `ou_tax` int(2) DEFAULT NULL COMMENT '单价是否含税 是和否',
  `ou_storage` varchar(30) DEFAULT NULL COMMENT '仓库（仓库表外键）',
  `ou_storageType` varchar(20) DEFAULT NULL COMMENT '销售出库类型（商品类型表外键）',
  `ou_RMB` varchar(30) DEFAULT NULL COMMENT '币别（货币类型表外键）',
  `ou_parities` int(9) DEFAULT NULL COMMENT '汇率（算出来的比例怎么算我很难说在讨论）',
  `ou_salesman` varchar(30) DEFAULT NULL COMMENT '员工表id（不想联查就在建一个员工姓名列）',
  `ou_department` varchar(30) DEFAULT NULL COMMENT '部门表id（不想联查就在建一个部门名子列）',
  `ou_debtBelong` varchar(30) DEFAULT NULL COMMENT '账款归属（客户钱给谁？？？？）',
  `ou_deDate` date DEFAULT NULL COMMENT '收款日期（根据收款条件自动生成的日期）',
  `ou_debtType` varchar(30) DEFAULT NULL COMMENT '收款条件一（类型自选到货付还是什么）',
  `ou_deYear` int(8) DEFAULT NULL COMMENT '收款条件二（时间几天）',
  `ou_debtMonth` date DEFAULT NULL COMMENT '收款月份',
  `ou_neoStaff` varchar(30) DEFAULT NULL COMMENT '制单人员',
  `ou_checkStaff` varchar(30) DEFAULT NULL COMMENT '复核人员',
  `ou_item` varchar(30) DEFAULT NULL COMMENT '所属项目',
  `ou_byzd1` varchar(30) DEFAULT NULL COMMENT '备用字段1',
  `ou_byzd2` varchar(30) DEFAULT NULL COMMENT '备用字段2',
  `ou_byzd3` varchar(30) DEFAULT NULL COMMENT '备用字段3',
  `ou_byzd4` varchar(30) DEFAULT NULL COMMENT '备用字段4',
  `ou_byzd5` varchar(30) DEFAULT NULL COMMENT '备用字段5',
  `ou_byzd6` varchar(30) DEFAULT NULL COMMENT '备用字段6',
  PRIMARY KEY (`ou_number`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `s_sell_out` */

/*Table structure for table `s_sell_outparticular` */

DROP TABLE IF EXISTS `s_sell_outparticular`;

CREATE TABLE `s_sell_outparticular` (
  `ou_number` varchar(11) NOT NULL COMMENT '单据号码(主键销售出库主表外键)',
  `S_line` varchar(11) NOT NULL COMMENT '单据行号(主键)',
  `S_identifier` varchar(30) DEFAULT NULL COMMENT '物料编号(物料表外键)',
  `S_name` varchar(30) DEFAULT NULL COMMENT '物料名称',
  `S_model` varchar(30) DEFAULT NULL COMMENT '规格型号',
  `S_unitName` varchar(30) DEFAULT NULL COMMENT '单位名称',
  `S_count` int(9) DEFAULT NULL COMMENT '数量',
  `S_rebatePrice` double DEFAULT NULL COMMENT '折扣前单价',
  `s_rebate` int(9) DEFAULT NULL COMMENT '折数',
  `S_price` double DEFAULT NULL COMMENT '单价',
  `S_money` double DEFAULT NULL COMMENT '金额',
  `S_taxes` int(8) DEFAULT NULL COMMENT '税率',
  `S_tax` double DEFAULT NULL COMMENT '税额',
  `S_costPrice` double DEFAULT NULL COMMENT '实际成本单价',
  `S_normPrice` double DEFAULT NULL COMMENT '标准成本单价',
  `S_taxMoney` double DEFAULT NULL COMMENT '含税金额',
  `S_gift` int(2) DEFAULT NULL COMMENT '赠品(是否是不要钱白给的东西 是就不能算钱成本还是要的就是不能算金总账里)',
  `S_numbers` varchar(30) DEFAULT NULL COMMENT '来源单号',
  `S_source` varchar(30) DEFAULT NULL COMMENT '来源单别',
  `S_remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `s_byzd1` varchar(30) DEFAULT NULL COMMENT '备用列1',
  `s_byzd2` varchar(30) DEFAULT NULL COMMENT '备用列2',
  `s_byzd3` varchar(30) DEFAULT NULL COMMENT '备用列3',
  `s_byzd4` varchar(30) DEFAULT NULL COMMENT '备用列4',
  `s_byzd5` varchar(30) DEFAULT NULL COMMENT '备用列5',
  PRIMARY KEY (`ou_number`,`S_line`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `s_sell_outparticular` */

/*Table structure for table `salesorder` */

DROP TABLE IF EXISTS `salesorder`;

CREATE TABLE `salesorder` (
  `so_Document_time` date DEFAULT NULL COMMENT '单据时间',
  `so_documentnumber` varchar(20) NOT NULL COMMENT '根据单据时间自动生成的单据号如（2019122001）',
  `so_Delivery_address` varchar(20) DEFAULT NULL COMMENT '送货地址根据客户编号自动带入送货地址如果没有也可手动添加',
  `so_ market_type` varchar(20) DEFAULT NULL COMMENT '销售订单类型',
  `so_customerorder` varchar(20) DEFAULT NULL COMMENT '客户订单',
  `so_tax` int(20) DEFAULT NULL COMMENT '是否含税',
  `so_Coin_arewell` varchar(20) DEFAULT NULL COMMENT '币别',
  `so_Oder_static` int(20) DEFAULT NULL COMMENT '单况',
  `so_Business_personnel` varchar(20) DEFAULT NULL COMMENT '业务人员编号',
  `so_Subordinate_department` varchar(20) DEFAULT NULL COMMENT '所属部门编号',
  `so_monograph` varchar(20) DEFAULT NULL COMMENT '制单人（根据登录的账号获取制单人员）',
  `so_reviewer` varchar(20) DEFAULT NULL COMMENT '复核人员（根据复核人员获取的复核人员名称、）',
  `so_Subordinate` varchar(20) DEFAULT NULL COMMENT '所属项目',
  `so_watchword` varchar(20) DEFAULT NULL COMMENT '表头条文',
  `so_Tailclause` varchar(20) DEFAULT NULL COMMENT '表尾条文',
  `so_Self_bound_column1` varchar(20) DEFAULT NULL COMMENT '自定栏1',
  `so_Self_bound_column2` varchar(20) DEFAULT NULL COMMENT '自定栏2',
  `So_remark` varchar(20) DEFAULT NULL COMMENT '备注',
  `so_account_ownership` varchar(20) DEFAULT NULL COMMENT '账款归属',
  `so_collection_time` date DEFAULT NULL COMMENT '收款时间',
  `so_collection_month` date DEFAULT NULL COMMENT '收款月份',
  `so_collection_terms` varchar(20) DEFAULT NULL COMMENT '收款条件',
  `so_collection_terms_day` varchar(20) DEFAULT NULL COMMENT '收款条件天数',
  `so_Spare1` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `so_Spare2` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `so_Spare3` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `so_Spare4` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `so_Spare5` varchar(20) DEFAULT NULL COMMENT '备用列1',
  PRIMARY KEY (`so_documentnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `salesorder` */

/*Table structure for table `salesorderlist` */

DROP TABLE IF EXISTS `salesorderlist`;

CREATE TABLE `salesorderlist` (
  `sol_documentnumber` varchar(20) NOT NULL COMMENT '单据号码',
  `sol_Id` int(20) DEFAULT NULL COMMENT '栏位',
  `sol_mat_number` varchar(20) DEFAULT NULL COMMENT '物料编号',
  `sol_mat_name` varchar(20) DEFAULT NULL COMMENT '物料名称',
  `sol_mat_type` varchar(20) DEFAULT NULL COMMENT '规格型号',
  `sol_nominal` varchar(20) DEFAULT NULL COMMENT '单位名称',
  `sol_quantity` int(20) DEFAULT NULL COMMENT '数量',
  `sol_pre_price` double DEFAULT NULL COMMENT '折扣前单价',
  `sol_fold` int(20) DEFAULT NULL COMMENT '折数',
  `Sol_price` double DEFAULT NULL COMMENT '单价',
  `sol_amount` double DEFAULT NULL COMMENT '金额',
  `sol_tax_rate` double DEFAULT NULL COMMENT '税率',
  `sol_tax` double DEFAULT NULL COMMENT '税额',
  `sol_tax_amount` double DEFAULT NULL COMMENT '含税金额',
  `sol_giveaway` int(20) DEFAULT NULL COMMENT '赠品',
  `sol_journalizing` varchar(20) DEFAULT NULL COMMENT '分录备注',
  `sol_Material_composition` int(20) DEFAULT NULL COMMENT '物料组合',
  `sol_Single_source` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `sol_Single_oder` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `sol_production` int(20) DEFAULT NULL COMMENT '生产',
  `sol_Scheduling_single_number` varchar(20) DEFAULT NULL COMMENT '排程单号',
  `sol_Produced_quantity` int(20) DEFAULT NULL COMMENT '已生产数量',
  `sol_Spare1` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `sol_Spare2` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `sol_Spare3` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `sol_Spare4` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `sol_Spare5` varchar(20) DEFAULT NULL COMMENT '备用列1',
  PRIMARY KEY (`sol_documentnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `salesorderlist` */

/*Table structure for table `salesquotation` */

DROP TABLE IF EXISTS `salesquotation`;

CREATE TABLE `salesquotation` (
  `Sq_documentnumber` varchar(20) NOT NULL COMMENT '根据单据时间自动生成的单据号如（2019122001）',
  `Sq_Document_time` date DEFAULT NULL COMMENT '单据时间',
  `Sq_Coin_arewell` varchar(20) DEFAULT NULL COMMENT '币别',
  `Sq_Exchange_rate` double DEFAULT NULL COMMENT '根据币别编号获取的汇率',
  `Sq_Effective_time` date DEFAULT NULL COMMENT '该报价单截止时间',
  `Sq_tax` int(2) DEFAULT NULL COMMENT '1=是，0=否',
  `Sq_Customer_number` varchar(20) DEFAULT NULL COMMENT '客户编号',
  `Sq_Delivery_address` varchar(20) DEFAULT NULL COMMENT '根据客户编号自动带入送货地址如果没有也可手动添加',
  `Sq_Business_personnel` varchar(20) DEFAULT NULL COMMENT '业务人员编号',
  `Sq_Subordinate_department,` varchar(20) DEFAULT NULL COMMENT '根据业务员自动获取所属部门，',
  `Sq_monograph` varchar(20) DEFAULT NULL COMMENT '根据登录的账号获取制单人员',
  `Sq_reviewers` varchar(20) DEFAULT NULL COMMENT '根据复核人员获取的复核人员名称、',
  `Sq_Spare1` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `Sq_Spare2` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `Sq_Spare3` varchar(20) DEFAULT NULL COMMENT '备用列1',
  `Sq_watchword` varchar(20) DEFAULT NULL COMMENT '表头条文',
  `Sq_Tailclause` varchar(20) DEFAULT NULL COMMENT '表尾条文',
  `Sq_Self_bound_column1` varchar(20) DEFAULT NULL COMMENT '自定栏1',
  `Sq_Self_bound_column2` varchar(20) DEFAULT NULL COMMENT '自定栏2',
  `Sq_remark` varchar(20) DEFAULT NULL COMMENT '备注',
  `Sq_static` int(2) DEFAULT NULL COMMENT '1=审核，0未审核',
  PRIMARY KEY (`Sq_documentnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `salesquotation` */

/*Table structure for table `salesquotationlist` */

DROP TABLE IF EXISTS `salesquotationlist`;

CREATE TABLE `salesquotationlist` (
  `Sql_documentnumber` varchar(20) NOT NULL,
  `Sql_Id` int(11) DEFAULT NULL,
  `Sql_mat_number` varchar(20) DEFAULT NULL,
  `Sql_mat_name` varchar(20) DEFAULT NULL,
  `Sql_mat_type` varchar(20) DEFAULT NULL,
  `Sql_nominal` varchar(20) DEFAULT NULL,
  `Sql_quantity` int(20) DEFAULT NULL,
  `Sql_pre_price` double DEFAULT NULL,
  `Sql_fold` int(20) DEFAULT NULL,
  `Sql_price` double DEFAULT NULL,
  `Sql_amount` double DEFAULT NULL,
  `Sql_tax_rate` double DEFAULT NULL,
  `Sql_tax` double DEFAULT NULL,
  `Sql_tax_amount` double DEFAULT NULL,
  `Sql_giveaway` int(20) DEFAULT NULL,
  `Sql_remark` varchar(20) DEFAULT NULL,
  `Sql_Spare1` varchar(20) DEFAULT NULL,
  `Sql_Spare2` varchar(20) DEFAULT NULL,
  `Sql_Spare3` varchar(20) DEFAULT NULL,
  `Sql_Spare4` varchar(20) DEFAULT NULL,
  `Sql_Spare5` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Sql_documentnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `salesquotationlist` */

/*Table structure for table `supplier_address` */

DROP TABLE IF EXISTS `supplier_address`;

CREATE TABLE `supplier_address` (
  `sa_id` int(11) NOT NULL COMMENT '给供应商引用地区编号',
  `sa_name` varchar(50) DEFAULT NULL COMMENT '地区名称',
  `sa_ename` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `sa_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz2` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz10` varchar(50) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`sa_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `supplier_address` */

/*Table structure for table `supplier_address_details` */

DROP TABLE IF EXISTS `supplier_address_details`;

CREATE TABLE `supplier_address_details` (
  `sad_id` int(11) NOT NULL COMMENT '编号自己写地址编号',
  `sad_smid` int(11) DEFAULT NULL COMMENT '对应的供应商供应商编号',
  `sad_address` varchar(50) DEFAULT NULL COMMENT '地址内容地址',
  `sad_email` varchar(50) DEFAULT NULL COMMENT '邮政编号',
  `sad_lx_man` varchar(50) DEFAULT NULL COMMENT '联系人',
  `sad_lx_lx` varchar(50) DEFAULT NULL COMMENT '联系人职称',
  `sad_lx_phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `sad_cz_num` varchar(50) DEFAULT NULL COMMENT '传真号码',
  `sad_runway` varchar(50) DEFAULT NULL COMMENT '行走路线',
  `sad_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `sad_bz1` varchar(50) DEFAULT NULL COMMENT '备用列',
  `sad_bz2` varchar(50) DEFAULT NULL COMMENT '备用列',
  `sad_bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `sad_bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `sad_bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `sad_bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `sad_bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `sad_bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `sad_bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `sad_bz10` varchar(50) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`sad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `supplier_address_details` */

/*Table structure for table `supplier_main` */

DROP TABLE IF EXISTS `supplier_main`;

CREATE TABLE `supplier_main` (
  `smid` int(11) NOT NULL AUTO_INCREMENT COMMENT '供应商编号',
  `smfname` varchar(40) DEFAULT NULL COMMENT '供应商全称',
  `smsname` varchar(20) DEFAULT NULL COMMENT '供应商简称',
  `smefname` varchar(80) DEFAULT NULL COMMENT '英文全称',
  `smssname` varchar(40) DEFAULT NULL COMMENT '英文简称',
  `smavid` int(11) DEFAULT NULL COMMENT '归属编号',
  `smtypeid` int(11) DEFAULT NULL COMMENT '供应商的类型类别编号',
  `smareaid` int(11) DEFAULT NULL COMMENT '地区地区编号',
  `smcurrencyid` int(11) DEFAULT NULL COMMENT '币别币别编号',
  `fz_man` varchar(50) DEFAULT NULL COMMENT '负责人',
  `lx_man` varchar(50) DEFAULT NULL COMMENT '联系人',
  `lx_phoneone` varchar(50) DEFAULT NULL COMMENT '联系电话1',
  `lx_phonetwo` varchar(50) DEFAULT NULL COMMENT '联系电话2',
  `lx_phonethree` varchar(50) DEFAULT NULL COMMENT '联系电话3',
  `lx_phone_mobile` varchar(50) DEFAULT NULL COMMENT '移动电话',
  `yh_num` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `khyh_num` int(11) DEFAULT NULL COMMENT '开户银行编号',
  `cg_man_id` int(11) DEFAULT NULL COMMENT '对应的员工采购人员编号',
  `sw_nums` varchar(50) DEFAULT NULL COMMENT '税务登记号',
  `zb_money` double DEFAULT NULL COMMENT '资本额',
  `hy_type` varchar(50) DEFAULT NULL COMMENT '行业别',
  `e_mail` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `intel_address` varchar(50) DEFAULT NULL COMMENT '网址',
  `cz_num` varchar(50) DEFAULT NULL COMMENT '传真号码',
  `startcg_rk_date` date DEFAULT NULL COMMENT '最初采购入库日',
  `startcg_th_date` date DEFAULT NULL COMMENT '最初采购退货日',
  `nearcg_rk_date` date DEFAULT NULL COMMENT '最近采购入库日',
  `nearcg_th_date` date DEFAULT NULL COMMENT '最近采购退货日',
  `price_hs_bl` tinyint(1) DEFAULT NULL COMMENT '单价是否含税',
  `end_jy_date` date DEFAULT NULL COMMENT '终止交易日',
  `zk_totalmoney` double DEFAULT NULL COMMENT '账款额度',
  `sy_money` double DEFAULT NULL COMMENT '剩余额度',
  `fk_where` int(11) DEFAULT NULL COMMENT '付款条件',
  `where_day` int(11) DEFAULT NULL COMMENT '条件天数',
  `month_jz_date` date DEFAULT NULL COMMENT '每月结账日',
  `xy_level` int(11) DEFAULT NULL COMMENT '信用等级',
  `fp_typeid` int(11) DEFAULT NULL COMMENT '发票类型',
  `start_yuf_money` double DEFAULT NULL COMMENT '期初预付款',
  `start_yinf_money` double DEFAULT NULL COMMENT '期初应付款',
  `last_yuf_money` double DEFAULT NULL COMMENT '期末预付款',
  `last_yinf_monet` double DEFAULT NULL COMMENT '期末应付款',
  `yufzk_subjectid` int(11) DEFAULT NULL COMMENT '预付账款科目编号',
  `yinfzk_subjectid` int(11) DEFAULT NULL COMMENT '应付账款科目编号',
  `yinfzg_subjectid` int(11) DEFAULT NULL COMMENT '应付暂估科目编号',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `bz1` int(11) DEFAULT NULL COMMENT '备用列',
  `bz2` int(11) DEFAULT NULL COMMENT '备用列',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz10` varchar(50) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`smid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `supplier_main` */

/*Table structure for table `supplier_type` */

DROP TABLE IF EXISTS `supplier_type`;

CREATE TABLE `supplier_type` (
  `st_id` int(11) NOT NULL COMMENT '字母+数字自增类别编号',
  `st_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `st_ename` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `st_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz2` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz10` varchar(50) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`st_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `supplier_type` */

/*Table structure for table `t_purchase_inquiry` */

DROP TABLE IF EXISTS `t_purchase_inquiry`;

CREATE TABLE `t_purchase_inquiry` (
  `billno` varchar(10) NOT NULL COMMENT '单据号码',
  `billdate` date DEFAULT NULL COMMENT '单据日期',
  `currid` int(11) DEFAULT NULL COMMENT '币别',
  `exchrate` double DEFAULT NULL COMMENT '汇率',
  `customerid` int(11) DEFAULT NULL COMMENT '供应商',
  `addressid` varchar(50) DEFAULT NULL COMMENT '供应商地址',
  `validdate` date DEFAULT NULL COMMENT '有效日期>=当前日期，若过了日期，此单据作废',
  `priceoftax` int(11) DEFAULT NULL COMMENT '单价是否含税',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `outaddress` varchar(200) DEFAULT NULL COMMENT '送货地址',
  `salesname` varchar(20) DEFAULT NULL COMMENT '采购人员',
  `departid` int(11) DEFAULT NULL COMMENT '所属部门',
  `maker` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `bz1` varchar(200) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(200) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(200) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(200) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(200) DEFAULT NULL COMMENT '备用5',
  PRIMARY KEY (`billno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购询价单';

/*Data for the table `t_purchase_inquiry` */

/*Table structure for table `t_purchase_inquiry_details` */

DROP TABLE IF EXISTS `t_purchase_inquiry_details`;

CREATE TABLE `t_purchase_inquiry_details` (
  `serno` varchar(10) NOT NULL COMMENT '栏号',
  `prodid` date DEFAULT NULL COMMENT '物料编号，来源物料主文件',
  `prodname` int(11) DEFAULT NULL COMMENT '物料名称，来源物料主文件',
  `prodsize` varchar(30) DEFAULT NULL COMMENT '规格型号，来源物料主文件',
  `sunitid` int(11) DEFAULT NULL COMMENT '单位名称，来源物料主文件',
  `squantity` int(11) DEFAULT NULL COMMENT '数量,要有小兰标签，但如果为0，不可保存',
  `oldprice` double DEFAULT NULL COMMENT '折扣前单价',
  `discount` double DEFAULT NULL COMMENT '折数（100%），来源物料主文件',
  `sprice` double DEFAULT NULL COMMENT '单价',
  `amount` double DEFAULT NULL COMMENT '金额',
  `taxrate` double DEFAULT NULL COMMENT '税率（100%）',
  `taxamt` double DEFAULT NULL COMMENT '税额',
  `vftotal` double DEFAULT NULL COMMENT '含税金额',
  `isgift` int(11) DEFAULT NULL COMMENT '是否赠品',
  `trantype` varchar(20) DEFAULT NULL COMMENT '来源单别，来源于销售订单',
  `fromno` varchar(20) DEFAULT NULL COMMENT '来源单号，来源于销售订单',
  `itemremark` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(200) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(200) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(200) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(200) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(200) DEFAULT NULL COMMENT '备用5',
  PRIMARY KEY (`serno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购询价明细表';

/*Data for the table `t_purchase_inquiry_details` */

/*Table structure for table `t_purchase_order` */

DROP TABLE IF EXISTS `t_purchase_order`;

CREATE TABLE `t_purchase_order` (
  `billno` varchar(10) NOT NULL COMMENT '单据号码',
  `billdate` date DEFAULT NULL COMMENT '单据日期',
  `curried` int(11) DEFAULT NULL COMMENT '币别',
  `exchrate` double DEFAULT NULL COMMENT '汇率',
  `customerid` int(11) DEFAULT NULL COMMENT '供应商',
  `addressid` varchar(50) DEFAULT NULL COMMENT '供应商地址',
  `billstyleid` int(11) DEFAULT NULL COMMENT '采购订单类型',
  `priceoftax` int(11) DEFAULT NULL COMMENT '单价是否含税',
  `billstatus` int(11) DEFAULT NULL COMMENT '单况，未审核前为未结案，审核后未入库量不为0，则为未结案，可强行结案或失效',
  `outaddress` varchar(200) DEFAULT NULL COMMENT '送货地址',
  `salesname` varchar(20) DEFAULT NULL COMMENT '采购人员',
  `departid` int(11) DEFAULT NULL COMMENT '所属部门',
  `maker` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `pojectname` varchar(20) DEFAULT NULL COMMENT '所属项目',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(100) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(100) DEFAULT NULL COMMENT '备用5',
  PRIMARY KEY (`billno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购订单';

/*Data for the table `t_purchase_order` */

/*Table structure for table `t_purchase_order_details` */

DROP TABLE IF EXISTS `t_purchase_order_details`;

CREATE TABLE `t_purchase_order_details` (
  `serno` varchar(10) NOT NULL COMMENT '栏号',
  `prodid` date NOT NULL COMMENT '物料编号，来源物料主文件',
  `prodname` int(11) DEFAULT NULL COMMENT '物料名称，来源物料主文件',
  `prodsize` varchar(30) DEFAULT NULL COMMENT '规格型号，来源物料主文件',
  `sunitid` int(11) DEFAULT NULL COMMENT '单位名称，来源物料主文件',
  `squantity` int(11) DEFAULT NULL COMMENT '数量,要有小兰标签，但如果为0，不可保存',
  `oldprice` double DEFAULT NULL COMMENT '折扣前单价',
  `discount` double DEFAULT NULL COMMENT '折数（100%），来源物料主文件',
  `sprice` double DEFAULT NULL COMMENT '单价',
  `amount` double DEFAULT NULL COMMENT '金额',
  `taxrate` double DEFAULT NULL COMMENT '税率（100%）',
  `taxamt` double DEFAULT NULL COMMENT '税额',
  `vftotal` double DEFAULT NULL COMMENT '含税金额',
  `isgift` int(11) DEFAULT NULL COMMENT '是否赠品',
  `trantype` varchar(20) DEFAULT NULL COMMENT '来源单别，来源于销售订单',
  `fromno` varchar(20) DEFAULT NULL COMMENT '来源单号，来源于销售订单',
  `itemremark` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(100) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(100) DEFAULT NULL COMMENT '备用5',
  PRIMARY KEY (`prodid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购订单明细表';

/*Data for the table `t_purchase_order_details` */

/*Table structure for table `t_purchase_requisitions_details` */

DROP TABLE IF EXISTS `t_purchase_requisitions_details`;

CREATE TABLE `t_purchase_requisitions_details` (
  `serno` varchar(20) DEFAULT NULL COMMENT '栏号',
  `prodid` date DEFAULT NULL COMMENT '物料编号，来源物料主文件',
  `prodname` varchar(20) DEFAULT NULL COMMENT '物料名称，来源物料主文件',
  `prodsize` varchar(20) DEFAULT NULL COMMENT '规格型号，来源物料主文件',
  `sunitid` int(11) DEFAULT NULL COMMENT '单位名称，来源物料主文件',
  `squantity` int(11) DEFAULT NULL COMMENT '数量,要有小兰标签，但如果为0，不可保存',
  `currid` int(11) DEFAULT NULL COMMENT '币别，来源物料主文件',
  `sprice` double DEFAULT NULL COMMENT '标准进价，来源物料主文件，有小兰标签',
  `amount` double DEFAULT NULL COMMENT '标准进价金额',
  `lastestcurrid` int(11) DEFAULT NULL COMMENT '最后一次交易币别，来源于采购入库单',
  `lastestprice` double DEFAULT NULL COMMENT '最后一次交易单价，来源于采购入库单',
  `lastestamount` double DEFAULT NULL COMMENT '最后一次交易进价金额，来源于采购入库单',
  `preindate` date DEFAULT NULL COMMENT '需求日期，不可大于当前日期',
  `suggestpurdate` date DEFAULT NULL COMMENT '建议采购日期，采购提前期',
  `qtyremain` int(11) DEFAULT NULL COMMENT '未采购量',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `trantype` varchar(20) DEFAULT NULL COMMENT '来源单别，来源于销售订单',
  `fromno` varchar(20) DEFAULT NULL COMMENT '来源单号，来源于销售订单',
  `itemremark` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `bz1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(100) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(100) DEFAULT NULL COMMENT '备用5'
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购请购明细表';

/*Data for the table `t_purchase_requisitions_details` */

/*Table structure for table `t_purchase_requisitions_type` */

DROP TABLE IF EXISTS `t_purchase_requisitions_type`;

CREATE TABLE `t_purchase_requisitions_type` (
  `classid` varchar(10) NOT NULL COMMENT '类型编号',
  `classname` varchar(20) DEFAULT NULL COMMENT '类型名称',
  `engname` varchar(20) DEFAULT NULL COMMENT '英文名称',
  `memo` varchar(50) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bz2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bz3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bz4` varchar(100) DEFAULT NULL COMMENT '备用4',
  `bz5` varchar(100) DEFAULT NULL COMMENT '备用5',
  PRIMARY KEY (`classid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='采购请购类型表';

/*Data for the table `t_purchase_requisitions_type` */

/*Table structure for table `tax_items` */

DROP TABLE IF EXISTS `tax_items`;

CREATE TABLE `tax_items` (
  `ti_id` int(11) NOT NULL COMMENT '税目编号',
  `ti_name` varchar(50) DEFAULT NULL COMMENT '税目名称',
  `ti_ename` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `ti_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz2` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz10` varchar(50) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`ti_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tax_items` */

/*Table structure for table `unit` */

DROP TABLE IF EXISTS `unit`;

CREATE TABLE `unit` (
  `u_id` int(11) NOT NULL COMMENT '单位编号',
  `u_name` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `u_ename` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz2` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz10` varchar(50) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `unit` */

/*Table structure for table `warehouse` */

DROP TABLE IF EXISTS `warehouse`;

CREATE TABLE `warehouse` (
  `w_id` int(11) NOT NULL COMMENT '仓库编号',
  `w_name` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `w_jname` varchar(50) DEFAULT NULL COMMENT '仓库简称',
  `w_ename` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `w_lx_man` varchar(50) DEFAULT NULL COMMENT '联系人员',
  `w_lx_phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `w_ck_address` varchar(50) DEFAULT NULL COMMENT '仓库地址',
  `w_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `bz1` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz2` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz3` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz4` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz5` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz6` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz7` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz8` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz9` varchar(50) DEFAULT NULL COMMENT '备用列',
  `bz10` varchar(50) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`w_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `warehouse` */

/*Table structure for table `y_advancechild` */

DROP TABLE IF EXISTS `y_advancechild`;

CREATE TABLE `y_advancechild` (
  `rows` double DEFAULT NULL COMMENT '行号',
  `id` varchar(11) DEFAULT NULL COMMENT '主表单据号',
  `advance` double DEFAULT NULL COMMENT '预付金额',
  `balance` varchar(11) DEFAULT NULL COMMENT '来源类别',
  `origintype` varchar(11) DEFAULT NULL COMMENT '来源单号',
  `ordid` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark2` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark3` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark4` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark5` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark6` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark7` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark8` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark9` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark10` varchar(255) DEFAULT NULL COMMENT '备用列'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `y_advancechild` */

/*Table structure for table `y_advancemain` */

DROP TABLE IF EXISTS `y_advancemain`;

CREATE TABLE `y_advancemain` (
  `id` varchar(11) DEFAULT NULL COMMENT '编号',
  `date` date DEFAULT NULL COMMENT '单据生成日期',
  `server` varchar(11) DEFAULT NULL COMMENT '供应商',
  `currency` varchar(11) DEFAULT NULL COMMENT '币别',
  `balancel1` double(10,0) DEFAULT NULL COMMENT '结算方式一',
  `balancel2` double(10,0) DEFAULT NULL COMMENT '结算方式二',
  `balancel3` double(10,0) DEFAULT NULL COMMENT '结算方式三',
  `moneyRate` double(10,0) DEFAULT NULL COMMENT '汇率',
  `dept` varchar(11) DEFAULT NULL COMMENT '所属部门',
  `maker` varchar(11) DEFAULT NULL COMMENT '制单人员',
  `item` varchar(11) DEFAULT NULL COMMENT '所属项目',
  `checker` varchar(11) DEFAULT NULL COMMENT '复核人员',
  `title1` varchar(255) DEFAULT NULL COMMENT '自定义栏',
  `title2` varchar(255) DEFAULT NULL COMMENT '自定义栏',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark2` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark3` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark4` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark5` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark6` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark7` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark8` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark9` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark10` varchar(255) DEFAULT NULL COMMENT '备用列'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `y_advancemain` */

/*Table structure for table `y_money_expect` */

DROP TABLE IF EXISTS `y_money_expect`;

CREATE TABLE `y_money_expect` (
  `id` varchar(20) NOT NULL COMMENT '单据编号',
  `date` date DEFAULT NULL COMMENT '单据日期',
  `client` varchar(20) DEFAULT NULL COMMENT '客户',
  `onterminationofTheaccount` date DEFAULT NULL COMMENT '终止帐月',
  `discount_rate` varchar(20) DEFAULT NULL COMMENT '汇率',
  `clearing_form1` varchar(20) DEFAULT NULL COMMENT '结算方式一',
  `clearing_form2` varchar(20) DEFAULT NULL COMMENT '结算方式二',
  `clearing_form3` varchar(20) DEFAULT NULL COMMENT '结算方式三',
  `department` varchar(20) DEFAULT NULL COMMENT '所属部门',
  `makePerson` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `checkPerson` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `subordinateToTheProject` varchar(20) DEFAULT NULL COMMENT '所属项目',
  `state` varchar(20) DEFAULT NULL COMMENT '状态',
  `remark1` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark2` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark3` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark4` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark5` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark6` varchar(20) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `y_money_expect` */

/*Table structure for table `y_money_expect1` */

DROP TABLE IF EXISTS `y_money_expect1`;

CREATE TABLE `y_money_expect1` (
  `id` varchar(20) NOT NULL COMMENT '编号',
  `sourseOrder` varchar(20) DEFAULT NULL COMMENT '开源单别注：该单来源  1.退货单2.出库单',
  `sourseNumber` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `rowNumber` varchar(20) DEFAULT NULL COMMENT '行号',
  `theAmountInAdvance` double DEFAULT NULL COMMENT '预收金额',
  `theAmountInAdvance1` double DEFAULT NULL COMMENT '预收金额',
  `remark1` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark2` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark3` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark4` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark5` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark6` varchar(20) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `y_money_expect1` */

/*Table structure for table `y_money_expect2` */

DROP TABLE IF EXISTS `y_money_expect2`;

CREATE TABLE `y_money_expect2` (
  `id` varchar(20) NOT NULL COMMENT '编号',
  `sourseOrder` varchar(20) DEFAULT NULL COMMENT '来源单别注：该单来源  1.退货单2.出库单',
  `sourseNumber` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `sourceLineNumber` varchar(20) DEFAULT NULL COMMENT '来源行号',
  `theAmountInAdvance1` double DEFAULT NULL COMMENT '预付金额',
  `theOriginalSingleAmount` double DEFAULT NULL COMMENT '原单金额',
  `theOriginalSingleAmount1` double DEFAULT NULL COMMENT '取用预付金额',
  `remark1` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark2` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark3` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark4` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark5` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark6` varchar(20) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `y_money_expect2` */

/*Table structure for table `y_money_should` */

DROP TABLE IF EXISTS `y_money_should`;

CREATE TABLE `y_money_should` (
  `id` varchar(20) NOT NULL COMMENT '单据编号',
  `date` date DEFAULT NULL COMMENT '单据日期',
  `client` varchar(20) DEFAULT NULL COMMENT '客户',
  `onTerminationOfTheAccount` date DEFAULT NULL COMMENT '终止帐月',
  `discount_rate` varchar(22) DEFAULT NULL COMMENT '折扣率',
  `clearing_form1` varchar(20) DEFAULT NULL COMMENT '结算方式一',
  `clearing_form2` varchar(20) DEFAULT NULL COMMENT '结算方式二',
  `clearing_form3` varchar(20) DEFAULT NULL COMMENT '结算方式三',
  `department` varchar(20) DEFAULT NULL COMMENT '所属部门',
  `makePerson` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `checkPerson` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `subordinateToTheProject` varchar(20) DEFAULT NULL COMMENT '所属项目',
  `state` varchar(20) DEFAULT NULL COMMENT '状态',
  `remark1` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark2` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark3` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark4` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark5` varchar(20) DEFAULT NULL COMMENT '备用列',
  `y_money_should` varchar(20) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `y_money_should` */

/*Table structure for table `y_money_shouldparticular` */

DROP TABLE IF EXISTS `y_money_shouldparticular`;

CREATE TABLE `y_money_shouldparticular` (
  `id` varchar(20) NOT NULL COMMENT '编号',
  `sourseOrder` varchar(20) DEFAULT NULL COMMENT '开源单别注：该单来源  1.退货单2.出库单',
  `sourseNumber` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `totalMoney` double DEFAULT NULL COMMENT '金额',
  `blance` double DEFAULT NULL COMMENT '余额',
  `date` date DEFAULT NULL COMMENT '日期',
  `makePerson` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `checkPerson` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `remark1` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark2` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark3` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark4` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark5` varchar(20) DEFAULT NULL COMMENT '备用列',
  `remark6` varchar(20) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `y_money_shouldparticular` */

/*Table structure for table `y_payformain` */

DROP TABLE IF EXISTS `y_payformain`;

CREATE TABLE `y_payformain` (
  `id` varchar(10) DEFAULT NULL COMMENT '编号',
  `date` date DEFAULT NULL COMMENT '单据生成日期',
  `server` varchar(11) DEFAULT NULL COMMENT '供应商',
  `currency` varchar(11) DEFAULT NULL COMMENT '币别',
  `balancel1` double DEFAULT NULL COMMENT '结算方式一',
  `balancel2` double DEFAULT NULL COMMENT '结算方式二',
  `balancel3` double DEFAULT NULL COMMENT '结算方式三',
  `moneyrate` double DEFAULT NULL COMMENT '汇率',
  `dept` varchar(10) DEFAULT NULL COMMENT '所属部门',
  `maker` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `item` varchar(10) DEFAULT NULL COMMENT '所属项目',
  `checker` varchar(10) DEFAULT NULL COMMENT '复核人员',
  `title1` varchar(255) DEFAULT NULL COMMENT '自定义栏',
  `title2` varchar(255) DEFAULT NULL COMMENT '自定义栏',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark2` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark3` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark4` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark5` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark6` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark7` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark8` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark9` varchar(255) DEFAULT NULL COMMENT '备用列',
  `remark10` varchar(255) DEFAULT NULL COMMENT '备用列'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `y_payformain` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
