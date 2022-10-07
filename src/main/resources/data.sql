create table member_entity(
                            num mumber,
                             id number,
                             name nvarchar2(100),
                             password nvarchar2(100)
);

create sequence login_id_seq;

insert into login_entity values(1,login_id_seq.nextVal,'park1','11234');
insert into login_entity values(2,login_id_seq.nextVal,'park2','21234');
insert into login_entity values(3,login_id_seq.nextVal,'park3','31234');
commit;
select * from login_entity;

-- 1.oracle sql생성
-- 2.entity클래스에 sequence등록
