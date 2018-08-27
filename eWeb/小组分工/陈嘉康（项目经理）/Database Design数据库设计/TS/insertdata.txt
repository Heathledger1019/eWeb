delete from relationship_5;
delete from emergency;
delete from complaint;
delete from tourist;
delete from hotel;
delete from administrator;

insert into tourist values('13250586307','01');
insert into tourist values('12325058630','02');
insert into tourist values('13325058630','03');
insert into tourist values('14325058630','04');
insert into tourist values('15325058630','05');
insert into tourist values('16325058630','06');

insert into administrator values('001','Jame','0');
insert into administrator values('002','White','1');
insert into administrator values('003','Sam','1');
insert into administrator values('004','John','0');
insert into administrator values('005','Waker','0');
insert into administrator values('006','Snow','0');

insert into complaint values('1019','13250586307','2011-05-09 11:49:45','投诉内容1','图片链接1','0','2011-05-09 11:49:45','','100hun');
insert into complaint values('2019','14325058630','2011-05-09 11:49:45','投诉内容2','图片链接2','0','2011-05-09 11:49:45','','90hun');
insert into complaint values('3019','13250586307','2011-05-09 11:49:45','投诉内容3','图片链接3','0','2011-05-09 11:49:45','','80hun');
insert into complaint values('4019','16325058630','2011-05-09 11:49:45','投诉内容4','图片链接4','0','2011-05-09 11:49:45','','70hun');


insert into emergency values('100','001','2011-05-09 11:49:45','2011-05-09 11:49:45','应急消息内容1','图片1','标题1');
insert into emergency values('200','001','2011-05-09 11:49:45','2011-05-09 11:49:45','应急消息内容2','图片2','标题2');
insert into emergency values('300','002','2011-05-09 11:49:45','2011-05-09 11:49:45','应急消息内容3','图片3','标题3');
insert into emergency values('400','004','2011-05-09 11:49:45','2011-05-09 11:49:45','应急消息内容4','图片4','标题4');

insert into hotel values('haccount1','aaa','酒店名字1','酒店地址1','酒店营业执照1','法人名字1','法人电话1','法人邮箱1','0','111','100.1');
insert into hotel values('haccount2','bbb','酒店名字2','酒店地址2','酒店营业执照2','法人名字2','法人电话2','法人邮箱2','1','101','30.1');
insert into hotel values('haccount3','ccc','酒店名字3','酒店地址3','酒店营业执照3','法人名字3','法人电话3','法人邮箱3','0','123','230.1');
insert into hotel values('haccount4','ddd','酒店名字4','酒店地址4','酒店营业执照4','法人名字4','法人电话4','法人邮箱4','1','187','330.1');

insert into Relationship_5 values('haccount1','13250586307');
insert into Relationship_5 values('haccount2','14325058630');
insert into Relationship_5 values('haccount1','15325058630');
insert into Relationship_5 values('haccount3','13250586307');