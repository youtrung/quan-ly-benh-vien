/*tang ID theo so le*/
create table NHANVIEN
(
	MANV int  primary key,
	HONV VARCHAR2(50),
	TENNV VARCHAR2(50),
	NGAYSINH DATE,
	MANQL int,
	CHUCVU VARCHAR2(50),
	LUONGCB INT ,
	USERNAME VARCHAR(10),
	MAKHOA int 
)
/*tang ID theo so le*/
create table KHOA
(
	MAKHOA int PRIMARY KEY,
	TENKHOA VARCHAR2(50),
	MANQL int,
  VITRI varchar(20)
)
/*tang ID bth*/
create table TINHTRANGCAPCUU
(
	MAGD INT PRIMARY KEY,
	TENGIAIDOAN VARCHAR2(10),
	HOTRO varchar(3),
	CHIPHI NUMBER(8,2)
)
/*tang ID bth*/
create table TRUONGHOP 
(
	MATH INT PRIMARY KEY ,
	TENTH VARCHAR2(50)
)
/*tang ID theo so chan*/
create table BENHNHAN
(
	MABN int PRIMARY KEY,
	TENBN VARCHAR2(50),
	MATH INT ,
	MAGD INT ,
	MAKHOA int,
  Ngay_BD date,
  Ngay_XV date
)
/*tang ID theo so chan*/
create table NGUOITHAM
(
	MAKH int PRIMARY KEY,
	MABN int,
	HOKH VARCHAR2(20),
	TENKH VARCHAR2(20),
	NGAYSINH DATE,
  NGAYTHAMBN DATE,
	PHONE CHAR(11),
	USERNAME  VARCHAR(10)
)

create table PHANCONG 
(
	MABN int,
	MANV int,
	NGAYTRUC DATE,
	CONSTRAINT PK_PC PRIMARY KEY (MABN,MANV,NGAYTRUC)
)
/* s? ngày ch?m b?nh ? ?ây có ch?c n?ng t? ??ng c?p nh?p l?i khi thêm vào tr??ng PHÂN CÔNG*/
CREATE TABLE DANHGIA 
(
	MABN int,
	MANV int,
	SONGAYCHAMBENH INT ,
	CONSTRAINT PK_DG PRIMARY KEY (MABN,MANV)
)
alter table NHANVIEN
add constraint FK_NV_MANQL foreign key (MANQL) references NhANVIEN(MANV);

alter table NHANVIEN
add CONSTRAINT FK_NV_MAKHOA foreign key (MAKHOA) references KHOA(MAKHOA);

alter table KHOA
add constraint FK_KH_NV foreign key (MANQL) REFERENCES NHANVIEN(MANV);

alter table BENHNHAN
add constraint FK_BN_MATH foreign key (MATH) references TRUONGHOP(MATH);

alter table BENHNHAN
ADD constraint FK_BN_MAGD foreign key (MAGD) references TINHTRANGCAPCUU(MAGD);

alter table BENHNHAN 
add constraint FK_BN_KHOA foreign key (MAKHOA) references KHOA(MAKHOA);

ALTER TABLE NGUOITHAM
add constraint FK_NGUOITHAM_BN foreign key (MABN) references BENHNHAN(MABN);

ALTER TABLE PHANCONG 
ADD CONSTRAINT FK_PC_BN foreign key (MABN) references BENHNHAN(MABN);

ALTER TABLE PHANCONG 
ADD CONSTRAINT FK_PC_NV foreign key (MANV) references NHANVIEN(MANV);


ALTER TABLE DANHGIA 
ADD CONSTRAINT FK_DG_BN FOREIGN KEY (MABN) references BENHNHAN(MABN);
ALTER TABLE DANHGIA 
ADD CONSTRAINT FK_DG_NV foreign key (MANV) references NHANVIEN(MANV);

/* hàm t? d?ng t?ng ID CHO NHAN VIEN */
create SEQUENCE AUTO_INCREMENT_SEQUENCE_NV
START WITH 1
INCREMENT BY 2;
create SEQUENCE AUTO_INCREMENT_SEQUENCE_KHOA
START WITH 1
INCREMENT BY 2;
CREATE OR REPLACE TRIGGER AUTO_INCREMENT_TRIGGER_NV
BEFORE INSERT ON
NHANVIEN 
REFERENCING NEW AS NEW
    FOR EACH ROW BEGIN SELECT
    AUTO_INCREMENT_SEQUENCE_NV.NEXTVAL INTO :NEW.MANV
    FROM DUAL;
END;
CREATE OR REPLACE TRIGGER AUTO_INCREMENT_TRIGGER
BEFORE INSERT ON
KHOA
REFERENCING NEW AS NEW
    FOR EACH ROW BEGIN SELECT
    AUTO_INCREMENT_SEQUENCE_KHOA.NEXTVAL INTO :NEW.MAKHOA
    FROM DUAL;
END;
/* hàm t? d?ng t?ng ID CHO BENH NHAN */
create SEQUENCE AUTO_INCREMENT_SEQUENCE_BN
START WITH 2
INCREMENT BY 2;
create SEQUENCE AUTO_INCREMENT_SEQUENCE_KH
START WITH 2
INCREMENT BY 2;
CREATE OR REPLACE TRIGGER AUTO_INCREMENT_TRIGGER_BN
BEFORE INSERT ON
BENHNHAN
REFERENCING NEW AS NEW
    FOR EACH ROW BEGIN SELECT
    AUTO_INCREMENT_SEQUENCE_BN.NEXTVAL INTO :NEW.MABN
    FROM DUAL;
END;
CREATE OR REPLACE TRIGGER AUTO_INCREMENT_TRIGGER_KH
BEFORE INSERT ON
NGUOITHAM
REFERENCING NEW AS NEW
    FOR EACH ROW BEGIN SELECT
    AUTO_INCREMENT_SEQUENCE_KH.NEXTVAL INTO :NEW.MAKH
    FROM DUAL;
END;
/* hàm t? d?ng t?ng ID bth co TINH TRANG CAP CUU VA TRUONG HOP  */
create SEQUENCE AUTO_INCREMENT_SEQUENCE
START WITH 1
INCREMENT BY 1;
create SEQUENCE AUTO_INCREMENT_SEQUENCE_TH
START WITH 1
INCREMENT BY 1;
CREATE OR REPLACE TRIGGER AUTO_INCREMENT_TRIGGER_TTCC
BEFORE INSERT ON
TINHTRANGCAPCUU
REFERENCING NEW AS NEW
    FOR EACH ROW BEGIN SELECT
    AUTO_INCREMENT_SEQUENCE.NEXTVAL INTO :NEW.MAGD
    FROM DUAL;
END;
CREATE OR REPLACE TRIGGER AUTO_INCREMENT_TRIGGER_TH
BEFORE INSERT ON
TRUONGHOP
REFERENCING NEW AS NEW
    FOR EACH ROW BEGIN SELECT
    AUTO_INCREMENT_SEQUENCE_TH.NEXTVAL INTO :NEW.MATH
    FROM DUAL;
END;
-------------------------------------------------------Nhap du lieu cho bang KHOA ----------------------------------------------------------
insert into KHOA(TENKHOA,VITRI)
Values(N'Khoa tim mạch','Khu A');
insert into KHOA(TENKHOA,VITRI)
Values(N'Khoa tim mạch tổng quát','Khu A');
insert into KHOA(TENKHOA,VITRI)
Values(N'Khoa nhịp tim học','Khu A');
insert into KHOA(TENKHOA,VITRI)
Values(N'Khoa Tiêu Hóa','Khu B');
insert into KHOA(TENKHOA,VITRI)
Values(N'Khoa Hô Hấp','Khu B');
insert into KHOA(TENKHOA,VITRI)
Values(N'Khoa Bệnh Nhiệt Đới','Khu B');
insert into KHOA(TENKHOA,VITRI)
Values(N'Khoa Thần Kinh Tổng Quát','Khu C');
insert into KHOA(TENKHOA,VITRI)
Values(N'Khoa Ngoại Thần Kinh ','Khu C');
insert into KHOA(TENKHOA,VITRI)
Values(N'Khoa Nội Thần Kinh','Khu C');

-------------------------------------------------------Nhap du lieu cho bang Nhan Vien ----------------------------------------------------------
insert into NHANVIEN (HONV,TENNV,NGAYSINH,CHUCVU,LUONGCB,MAKHOA)
Values(N'Nguyễn',N'Đình Dự','01/OCT/1988',N'Trưởng Phòng',70000000,1);
insert into NHANVIEN (HONV,TENNV,NGAYSINH,CHUCVU,LUONGCB,MAKHOA)
Values(N'Nguyễn',N'Công Trứ','03/OCT/1988',N'Nhân Viên',30000000,1);
insert into NHANVIEN (HONV,TENNV,NGAYSINH,CHUCVU,LUONGCB,MAKHOA)
Values(N'Nguyễn',N'Đoàn Dự','10/OCT/1988',N'Nhân Viên',30000000,1);
insert into NHANVIEN (HONV,TENNV,NGAYSINH,CHUCVU,LUONGCB,MAKHOA)
Values(N'Trần',N'Công Dự','01/OCT/1988',N'Nhân Viên',30000000,1);
insert into NHANVIEN (HONV,TENNV,NGAYSINH,CHUCVU,LUONGCB,MAKHOA)
Values(N'Trần',N'Văn Toàn','01/NOV/1998',N'Nhân Viên',30000000,1);
insert into NHANVIEN (HONV,TENNV,NGAYSINH,CHUCVU,LUONGCB,MAKHOA)
Values(N'Trần',N'Văn Thông','01/FEB/1999',N'Trưởng Phòng',70000000,3);
insert into NHANVIEN (HONV,TENNV,NGAYSINH,CHUCVU,LUONGCB,MAKHOA)
Values(N'Nguyễn',N'Văn Toàn','12/NOV/1990',N'Nhân Viên',30000000,3);
insert into NHANVIEN (HONV,TENNV,NGAYSINH,CHUCVU,LUONGCB,MAKHOA)
Values(N'Trần',N'Văn Phong','11/NOV/1998',N'Nhân Viên',30000000,3);
insert into NHANVIEN (HONV,TENNV,NGAYSINH,CHUCVU,LUONGCB,MAKHOA)
Values(N'Trần',N'Văn Toàn','19/MAR/1995',N'Nhân Viên',30000000,3);
insert into NHANVIEN (HONV,TENNV,NGAYSINH,CHUCVU,LUONGCB,MAKHOA)
Values(N'Vũ',N'Văn Lê','01/NOV/1998',N'Nhân Viên',30000000,3);
--------------------------------------------------------Nhập liệu cho bảng TRƯỜNG HỢP -----------------------------------------------------
INSERT INTO TRUONGHOP(TENTH)
VALUES (N'Ngoại thương');
INSERT INTO TRUONGHOP(TENTH)
VALUES (N'Nội thương');
-------------------------------------------------------Nhập liệu cho bảng TÌNH TRẠNG CẤP CÚU------------------------------
INSERT INTO TINHTRANGCAPCUU(TENGIAIDOAN,HOTRO,CHIPHI)
VALUES (N'GĐ-1',N'NO',0);
INSERT INTO TINHTRANGCAPCUU(TENGIAIDOAN,HOTRO,CHIPHI)
VALUES (N'GĐ-1-1',N'YES',50000);
INSERT INTO TINHTRANGCAPCUU(TENGIAIDOAN,HOTRO,CHIPHI)
VALUES (N'GĐ-1-2',N'YES',100000);
INSERT INTO TINHTRANGCAPCUU(TENGIAIDOAN,HOTRO,CHIPHI)
VALUES (N'GĐ-1-3',N'YES',150000);
INSERT INTO TINHTRANGCAPCUU(TENGIAIDOAN,HOTRO,CHIPHI)
VALUES (N'GĐ-2-1',N'YES',200000);
INSERT INTO TINHTRANGCAPCUU(TENGIAIDOAN,HOTRO,CHIPHI)
VALUES (N'GĐ-2-2',N'YES',250000);
INSERT INTO TINHTRANGCAPCUU(TENGIAIDOAN,HOTRO,CHIPHI)
VALUES (N'GĐ-2-3',N'YES',350000);
INSERT INTO TINHTRANGCAPCUU(TENGIAIDOAN,HOTRO,CHIPHI)
VALUES (N'GĐ-3-1',N'YES',400000);
INSERT INTO TINHTRANGCAPCUU(TENGIAIDOAN,HOTRO,CHIPHI)
VALUES (N'GĐ-3-2',N'YES',450000);
INSERT INTO TINHTRANGCAPCUU(TENGIAIDOAN,HOTRO,CHIPHI)
VALUES (N'GĐ-3-3',N'YES',500000);
------------------------------------------------------NHẬP LIỆU CHO BẢNG BỆNH NHÂN-----------------------------
----LƯU Ý NHỮNG GÌ THUỘC VỀ ĐỐI TƯỢNG CỦA BỆNH VIỆN NHƯ KHOA, NHÂN VIÊN THÌ MÃ CỦA NÓ ĐỀU LÀ SỐ LẺ .------ 
INSERT INTO BENHNHAN(TENBN,MATH,MAGD,MAKHOA,NGAY_BD)
VALUES ('');


---------------------------------------------------------Bài tập tuần 6 ---------------------------------------------------------------------
------------------------------------Dữ liệu lấy có ngày tháng năm, có thay đổi định dạng theo ngày, tháng, năm
select TENNV,to_char(NGAYSINH,'DD/MM/YYYY') as DOB 
from NHANVIEN
where NGAYSINH='19/MAR/95';
----------------------------------------------------- Sắp xếp dữ liệu tăng dần theo cột một ,và giảm theo hoNV----------------
Select TENNV,HONV
from NHANVIEN
order by 1 ASC,HONV DESC ; 
--------------------------------------------- Dùng giới hạn trong truy vấn--------------------------------------
select *
from NHANVIEN 
offset 5 row 
fetch next 5 rows only;
------------------------- Sử dụng một biến có tiền tố là dấu và (&) để nhắc người dùng nhập một giá trị
Select &col1
from NHANVIEN
where NGAYSINH>'&col2';
----------------------------------------------------------------
Define num_1=10000
Select *
from NHANVIEN
where LUONGCB>=&num_1;
UNDEFINE num_1 ;
--------------------------------------------------- Sử dụng các hàm ký tự--------------------------------------------------------------------
Select CONCAT(HONV,TENNV) as FULLNAME,SUBSTR(CONCAT(HONV,TENNV),1,6),LENGTH(TENNV),INSTR(HONV,'N'),LPAD(HONV,10,'*')
From NHANVIEN;
----------------------------------------------------- Các hàm về số học
--------------------------------------Sử dụng hàm SYSDATE và Hàm tính khoảng cách ngày, giờ
------------------------------------------------- Hàm chuyển đổi dữ liệu
------------------------------------------------------------ Hàm NVL 
-------------------------------------------------------------- Case
------------------------------------------------------------- Kết nhóm


