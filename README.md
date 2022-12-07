# SportsTeamManagement


#SQL Config
create database SportsTeam;
use SportsTeam;

create table Events(
EventsID Int not null auto_increment,
primary key (EventsID),
EventsTitle varchar(1000) not null,
EventsType varchar(1000) not null,
EventsDetails varchar(1000) not null,
EventsDate varchar(1000) not null
);

insert into Events (EventsTitle, EventsType, EventsDetails, EventsDate) values ("NY VS NJ", "Game", "At NY MSG", "11/13/2022");
insert into Events (EventsTitle, EventsType, EventsDetails, EventsDate) values ("Training Camp 1", "Training", "At NY MSG", "11/14/2022");


create table Admins(
AdminID Int not null auto_increment,
primary key (AdminID),
Username varchar(100) not null unique,
Pass varchar(100) not null,
Email varchar(100) not null unique,
AdminContactInfo varchar(100) not null,
AdminFirstName varchar(100) not null,
AdminLastName varchar(100) not null,
AdminDetails varchar(100)
);

insert into Admins (Username, Pass, Email, AdminContactInfo, AdminFirstName, AdminLastName, AdminDetails) values ("Valentine99","abc123","test@gmail.com","347-222-2222","Valentine","Shidlovskiy","Developer");
insert into Admins (Username, Pass, Email, AdminContactInfo, AdminFirstName, AdminLastName, AdminDetails) values ("BestCoach27","bestPass","BC27@gmail.com","718-111-1111","John","Smith","Head Coach");


create table ClubStats (
StatID Int not null auto_increment,
primary key (StatID),
Statistic varchar(100) not null,
StatType varchar(100)not null,
Player varchar(100)not null,
Season varchar(100) not null
);

insert into ClubStats (Statistic, StatType, Player, Season) values ("Best Shooter","Award","Jimmy Debe","2001-2002");
insert into ClubStats (Statistic, StatType, Player, Season) values ("Cup Winner","Prize","TEAM","2004-2005");
insert into ClubStats (Statistic, StatType, Player, Season) values ("MSG","Arena","Team","2001-2022");


create table Players (
PlayerID Int not null auto_increment,
primary key (PlayerID),
FirstName varchar(100) not null,
LastName varchar(100) not null,
PlayerPosition varchar(100) not null,
DominantHand varchar(100) not null,
PlayerHealth varchar(100) not null,
DOB varchar(100) not null,
ContactInfo varchar(100) not null,
SponsorName varchar(100) not null,
PlayerStats varchar(1000) not null
);

insert into Players (FirstName, LastName, PlayerPosition, DominantHand, PlayerHealth, DOB, ContactInfo, SponsorName, PlayerStats) values ("Jack","Adams","Center","Left","Healthy","01-20-2020","646-222-2222","Nike","Goals: 234, Asssists: 23, Points: 257");
insert into Players (FirstName, LastName, PlayerPosition, DominantHand, PlayerHealth, DOB, ContactInfo, SponsorName, PlayerStats) values ("Jerry","Johnson","Defence","Right","Broken Arm","10-10-2022","646-222-1111","Adidas","Goals: 22, Asssists: 21, Points: 43");


show tables;
select * from Admins;
select * from ClubStats;
select * from Events;
select * from Players;
