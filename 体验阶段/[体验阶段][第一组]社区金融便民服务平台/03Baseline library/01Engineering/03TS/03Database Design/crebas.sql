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
   title                varchar(50) not null comment '社区活动新闻标题',
   time                 date not null comment '发布时间 ',
   content              text not null comment '活动内容(业务链接放在内容之中)',
   primary key (id)
);

alter table community_activity comment '社区活动';

/*==============================================================*/
/* Table: franchisee                                            */
/*==============================================================*/
create table franchisee
(
   id                   int not null auto_increment,
   name                 varchar(50) not null comment '加盟商名称',
   account              varchar(50) not null comment '加盟商账号',
   password             varchar(50) not null comment '加盟商密码',
   phone                varchar(11) not null comment '加盟商电话号码',
   address              varchar(255) not null comment '加盟商地址',
   primary key (id)
);

alter table franchisee comment '加盟商
';

/*==============================================================*/
/* Table: informtaion                                           */
/*==============================================================*/
create table informtaion
(
   id                   int not null auto_increment,
   title                varchar(50) not null comment '资讯的标题',
   content              text not null comment '资讯内容',
   type                 enum('饮食','运动','养生') not null comment '资讯类别
            1：饮食健康资讯
            2：运动健康资讯
            3：养生健康资讯',
   origin               text comment '资讯来源',
   author               varchar(50) comment '资讯作者',
   primary key (id)
);

alter table informtaion comment '资讯';

/*==============================================================*/
/* Table: news                                                  */
/*==============================================================*/
create table news
(
   id                   int not null auto_increment,
   f_id                 int not null comment '加盟商id',
   title                varchar(50) not null comment '新闻标题',
   time                 date not null comment '发布时间',
   content              text not null comment '新闻内容(业务链接放在这里)',
   primary key (id)
);

alter table news comment '新闻
';

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   u_id                 int not null,
   s_id                 int not null,
   status               bool not null comment '订单进度
            true为已完成
            false为待完成',
   primary key (u_id, s_id)
);

alter table orders comment '订单名称=服务名称
订单价格在服务说明之中
订单号即为服务id';

/*==============================================================*/
/* Table: participate                                           */
/*==============================================================*/
create table participate
(
   u_id                 int not null,
   c_id                 int not null,
   primary key (u_id, c_id)
);

alter table participate comment '参与的活动
';

/*==============================================================*/
/* Table: service                                               */
/*==============================================================*/
create table service
(
   id                   int not null auto_increment,
   f_id                 int not null comment '加盟商id',
   type                 enum('家政洗衣','家政服务','家教服务','社区租房','家电维修','电脑IT维修','生活助理','有机蔬菜配送') not null comment '服务类型',
   explanation          text comment '服务说明：可填写收费标准，服务名称等。',
   name                 varchar(50) not null comment '服务名称',
   primary key (id)
);

alter table service comment '业务/服务';

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null auto_increment,
   name                 varchar(50) not null comment '用户姓名',
   phone                varchar(11) not null comment '用户手机号，也是账号',
   password             varchar(50) not null comment '用户密码',
   email                varchar(50) not null comment '电子邮箱',
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

