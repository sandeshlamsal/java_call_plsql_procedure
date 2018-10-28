# java_call_plsql_procedure

#below procedure will be created using mysql using test user

creata PROCEDURE `add_productlines`()
BEGIN
insert into productlines values('laptop','laptop',NULL,NULL);
END
