/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     18/8/6 16:27:54                              */
/*==============================================================*/


drop table if exists informtaion;

drop table if exists news;

drop table if exists orders;

drop table if exists participate;

drop table if exists service;

drop table if exists user;

drop table if exists admin;
drop table if exists community_activity;
drop table if exists franchisee;

/*==============================================================*/
/* Table: admin                                                 */
/*==============================================================*/
create table admin
(
   account              varchar(50) not null,
   password             varchar(50) not null,
   primary key (account)
);

/*==============================================================*/
/* Table: community_activity                                    */
/*==============================================================*/
create table community_activity
(
   id                   int not null auto_increment,
   title                varchar(50) not null comment '��������ű���',
   time                 date not null comment '����ʱ�� ',
   content              text not null comment '�����(ҵ�����ӷ�������֮��)',
   primary key (id)
);

alter table community_activity comment '�����';

/*==============================================================*/
/* Table: franchisee                                            */
/*==============================================================*/
create table franchisee
(
   id                   int not null auto_increment,
   name                 varchar(50) not null comment '����������',
   account              varchar(50) not null comment '�������˺�',
   password             varchar(50) not null comment '����������',
   phone                varchar(11) not null comment '�����̵绰����',
   address              varchar(255) not null comment '�����̵�ַ',
   primary key (id)
);

alter table franchisee comment '������
';

/*==============================================================*/
/* Table: informtaion                                           */
/*==============================================================*/
create table informtaion
(
   id                   int not null auto_increment,
   title                varchar(50) not null comment '��Ѷ�ı���',
   content              text not null comment '��Ѷ����',
   type                 enum('��ʳ','�˶�','����') not null comment '��Ѷ���
            1����ʳ������Ѷ
            2���˶�������Ѷ
            3������������Ѷ',
   origin               text comment '��Ѷ��Դ',
   author               varchar(50) comment '��Ѷ����',
   primary key (id)
);

alter table informtaion comment '��Ѷ';

/*==============================================================*/
/* Table: news                                                  */
/*==============================================================*/
create table news
(
   id                   int not null auto_increment,
   f_id                 int not null comment '������id',
   title                varchar(50) not null comment '���ű���',
   time                 date not null comment '����ʱ��',
   content              text not null comment '��������(ҵ�����ӷ�������)',
   primary key (id)
);

alter table news comment '����
';

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   u_id                 int not null,
   s_id                 int not null,
   status               bool not null comment '��������
            trueΪ�����
            falseΪ�����',
   primary key (u_id, s_id)
);

alter table orders comment '��������=��������
�����۸��ڷ���˵��֮��
�����ż�Ϊ����id';

/*==============================================================*/
/* Table: participate                                           */
/*==============================================================*/
create table participate
(
   u_id                 int not null,
   c_id                 int not null,
   primary key (u_id, c_id)
);

alter table participate comment '����Ļ
';

/*==============================================================*/
/* Table: service                                               */
/*==============================================================*/
create table service
(
   id                   int not null auto_increment,
   f_id                 int not null comment '������id',
   type                 enum('����ϴ��','��������','�ҽ̷���','�����ⷿ','�ҵ�ά��','����ITά��','��������','�л��߲�����') not null comment '��������',
   explanation          text comment '����˵��������д�շѱ�׼���������Ƶȡ�',
   name                 varchar(50) not null comment '��������',
   primary key (id)
);

alter table service comment 'ҵ��/����';

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null auto_increment,
   name                 varchar(50) not null comment '�û�����',
   phone                varchar(11) not null comment '�û��ֻ��ţ�Ҳ���˺�',
   password             varchar(50) not null comment '�û�����',
   email                varchar(50) not null comment '��������',
   primary key (id)
);

alter table news add constraint FK_Relationship_6 foreign key (f_id)
      references franchisee (id) on delete cascade on update cascade;

alter table orders add constraint FK_orders foreign key (u_id)
      references user (id) on delete cascade on update cascade;

alter table orders add constraint FK_orders2 foreign key (s_id)
      references service (id) on delete cascade on update cascade;

alter table participate add constraint FK_participate foreign key (u_id)
      references user (id) on delete cascade on update cascade;

alter table participate add constraint FK_participate2 foreign key (c_id)
      references community_activity (id) on delete cascade on update cascade;

alter table service add constraint FK_Relationship_7 foreign key (f_id)
      references franchisee (id) on delete cascade on update cascade;

