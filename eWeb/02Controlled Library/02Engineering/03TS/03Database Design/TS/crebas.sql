/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/8/14 17:11:54                           */
/*==============================================================*/


drop table if exists MidScenicSpot;

drop table if exists Relationship_5;

drop table if exists complaint;

drop table if exists emergency;

drop table if exists Restaurant;

drop table if exists ScenicSpot;

drop table if exists administrator;

drop table if exists hotel;

drop table if exists tourist;

/*==============================================================*/
/* Table: MidScenicSpot                                         */
/*==============================================================*/
create table MidScenicSpot
(
   m_id                 national varchar(50) not null,
   s_id                 national varchar(50),
   m_name               national varchar(50) not null,
   primary key (m_id)
);

/*==============================================================*/
/* Table: Relationship_5                                        */
/*==============================================================*/
create table Relationship_5
(
   id                   national varchar(50) not null ,
   phone                national varchar(50) not null ,
   primary key (id, phone)
);

/*==============================================================*/
/* Table: Restaurant                                            */
/*==============================================================*/
create table Restaurant
(
   r_id                 national varchar(50) not null ,
   s_id                 national varchar(50),
   r_name               national varchar(50) not null,
   r_more               national varchar(50),
   r_cost               national varchar(50),
   r_score              numeric(30,0),
   primary key (r_id)
);

/*==============================================================*/
/* Table: ScenicSpot                                            */
/*==============================================================*/
create table ScenicSpot
(
   s_id                 national varchar(50) not null ,
   s_name               national varchar(50) not null,
   s_temperature        numeric(30,0),
   s_humidity           numeric(30,0),
   s_airquality         national varchar(50),
   s_pollution          national varchar(50),
   wind_direction       national varchar(50),
   wind_power           numeric(30,0),
   comfort_degree       national varchar(50),
   primary key (s_id)
);

/*==============================================================*/
/* Table: administrator                                         */
/*==============================================================*/
create table administrator
(
   id2                  int not null AUTO_INCREMENT,
   name                 national varchar(50) not null,
   sex                  bool not null comment 'true������
            false��Ů��',
   primary key (id2)
);

/*==============================================================*/
/* Table: complaint                                             */
/*==============================================================*/
create table complaint
(
   id4                  national varchar(50) not null ,
   phone                national varchar(50),
   time                 datetime not null,
   content              national varchar(50) not null,
   photo2               national varchar(50) comment '��������ͼƬ��Ƶ�����ݣ����ֶδ�Ÿ����ı���·��',
   ishandle             bool not null,
   dealtime             datetime,
   answer               national varchar(50),
   evaluate             national varchar(50),
   primary key (id4)
);

/*==============================================================*/
/* Table: emergency                                             */
/*==============================================================*/
create table emergency
(
   id3                  national varchar(50) not null ,
   id2                  int,
   starttime            datetime not null,
   endtime              datetime not null,
   content              national varchar(50) not null,
   photo                national varchar(50) comment '�������ݿ�����ͼƬ��Ƶ�����ݣ����ֶδ�Ÿ�����ŵ�·��',
   title                national varchar(50) not null,
   primary key (id3)
);

/*==============================================================*/
/* Table: hotel                                                 */
/*==============================================================*/
create table hotel
(
   id                   national varchar(50) not null ,
   passwd               national varchar(50) not null,
   name                 national varchar(50) not null,
   address              national varchar(50) not null,
   prove                national varchar(50) not null comment '�Ƶ�ƾ֤Ϊ�Ƶ�ľ�Ӫִ��֮���֤��
            ���ֶδ�ŵ���ƾ֤ͼƬ������ļ��Ĵ��·��',
   con_name             national varchar(50) not null,
   phone                national varchar(50) not null,
   email                national varchar(50) not null,
   ispass               bool not null comment '���ݷ�Χ��0��1��2
            0������δ����
            1����������ͨ��
            2����������δͨ��',
   number               int,
   cost                 numeric(30,0),
   primary key (id)
);

/*==============================================================*/
/* Table: tourist                                               */
/*==============================================================*/
create table tourist
(
   phone                national varchar(50) not null ,
   passwd               national varchar(50) not null,
   primary key (phone)
);

alter table MidScenicSpot add constraint FK_Relationship_9 foreign key (s_id)
      references ScenicSpot (s_id);

alter table Relationship_5 add constraint FK_Relationship_5 foreign key (id)
      references hotel (id);

alter table Relationship_5 add constraint FK_Relationship_6 foreign key (phone)
      references tourist (phone);

alter table Restaurant add constraint FK_Relationship_8 foreign key (s_id)
      references ScenicSpot (s_id);

alter table complaint add constraint FK_Relationship_7 foreign key (phone)
      references tourist (phone);

alter table emergency add constraint FK_Relationship_10 foreign key (id2)
      references administrator (id2);

