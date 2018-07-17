/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/7/10 11:39:04                           */
/*==============================================================*/


drop table if exists News;

drop table if exists Newscheck;

drop table if exists Orders;

drop table if exists Pays;

drop table if exists Payslist;

drop table if exists Userscheck;

drop table if exists admin;

drop table if exists users;

/*==============================================================*/
/* Table: News                                                  */
/*==============================================================*/
create table News
(
   n_flag               national varchar(50) not null,
   n_id                 national varchar(50) not null,
   u_id                 national varchar(50),
   nc_id                national varchar(50),
   title                national varchar(50) not null,
   n_body               national varchar(50) not null,
   author               national varchar(50),
   n_date               date not null,
   n_abouts             national varchar(50),
   n_passflag           bool not null,
   primary key (n_id)
);

/*==============================================================*/
/* Table: Newscheck                                             */
/*==============================================================*/
create table Newscheck
(
   nc_id                national varchar(50) not null,
   nc_commitdate        date not null,
   nc_enddate           date,
   nc_flag              bool not null,
   nc_body              national varchar(50) not null,
   primary key (nc_id)
);

/*==============================================================*/
/* Table: Orders                                                */
/*==============================================================*/
create table Orders
(
   o_id                 national varchar(50) not null,
   u_id                 national varchar(50),
   o_name               national varchar(50) not null,
   price                numeric(50,0) not null,
   process              national varchar(50) not null,
   o_abouts             national varchar(50),
   primary key (o_id)
);

/*==============================================================*/
/* Table: Pays                                                  */
/*==============================================================*/
create table Pays
(
   u_id                 national varchar(50),
   watercost            numeric(50,0),
   thundercost          numeric(50,0),
   gascost              numeric(50,0),
   phonecost            numeric(50,0),
   mouth                national varchar(50) not null
);

/*==============================================================*/
/* Table: Payslist                                              */
/*==============================================================*/
create table Payslist
(
   u_id                 national varchar(50),
   p_flag               national varchar(50) not null,
   p_date               date not null,
   pay                  numeric(50,0) not null
);

/*==============================================================*/
/* Table: Userscheck                                            */
/*==============================================================*/
create table Userscheck
(
   uc_number            national varchar(50) not null,
   uc_commitdate        date not null,
   uc_id                national varchar(50) not null,
   uc_flag              bool not null,
   uc_enddate           date,
   primary key (uc_id)
);

/*==============================================================*/
/* Table: admin                                                 */
/*==============================================================*/
create table admin
(
   a_name               national varchar(50) not null,
   a_id                 national varchar(50) not null,
   a_psd                national varchar(50) not null,
   a_flag               national varchar(50) not null,
   primary key (a_id)
);

/*==============================================================*/
/* Table: users                                                 */
/*==============================================================*/
create table users
(
   u_id                 national varchar(50) not null,
   uc_id                national varchar(50),
   u_name               national varchar(50) not null,
   psd                  national varchar(50) not null,
   number               national varchar(50),
   u_abouts             national varchar(50),
   phone                national varchar(50) not null,
   primary key (u_id)
);

alter table News add constraint FK_Relationship_5 foreign key (u_id)
      references users (u_id) on delete restrict on update restrict;

alter table News add constraint FK_Relationship_6 foreign key (nc_id)
      references Newscheck (nc_id) on delete restrict on update restrict;

alter table Orders add constraint FK_Relationship_1 foreign key (u_id)
      references users (u_id) on delete restrict on update restrict;

alter table Pays add constraint FK_Relationship_3 foreign key (u_id)
      references users (u_id) on delete restrict on update restrict;

alter table Payslist add constraint FK_Relationship_4 foreign key (u_id)
      references users (u_id) on delete restrict on update restrict;

alter table users add constraint FK_Relationship_2 foreign key (uc_id)
      references Userscheck (uc_id) on delete restrict on update restrict;

