select firstName, lastName, city, state from person as p
left join address a on p.personId=a.personId;