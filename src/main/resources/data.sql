insert into login (user_name, password, enabled, role) values('admin', 'secret', true, 'ROLE_ADMIN');

insert into products(name, description, image) values('Cash and Valuables in Transit', 'Fire, Accidental damage, Hijacking, Theft & Armed Robbery � as per standard policy wording.', '/img/products/Cash and Valuables in Transit1.jpg');
insert into products(name, description, image) values('Static Cover Cash and Valuables', 'Fire, Accidental damage, Hijacking, Theft & Armed Robbery � as per standard policy wording.','/img/products/Static Cover Cash and Valuables.jpg');
insert into products(name, description, image) values('Fine Art and Collectables', 'Fire, Accidental damage, Hijacking, Theft & Armed Robbery � as per standard policy wording.', '/img/products/Fine Art and Collectables1.jpg');
insert into products(name, description, image) values('Static and In Transit Cover Cash and Valuables', 'Fire, Accidental damage, Hijacking, Theft & Armed Robbery � as per standard policy wording.', '/img/products/Static and In Transit Cover Cash and Valuables1.jpg'); 

insert into answer_types(answer_type) values('text');
insert into answer_types(answer_type) values('number');
insert into answer_types(answer_type) values('select');
insert into answer_types(answer_type) values('checkbox');
insert into answer_types(answer_type) values('textarea');


/*insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '1', 'What is your full name ?', 				1, 	null, null);
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '2', 'What is your gender ?',    				3, 	null, null);
insert into answer_values(questionnaire_id, answer_value) values(2, 'Female');
insert into answer_values(questionnaire_id, answer_value) values(2, 'Male');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '3', 'What is your salary ?',    				2, 	2,    'Female');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '4', 'What is your age ?',       				2, 	2,    'Male');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '5', 'Do you have any criminal record ?', 	4, 	null,  null);
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '6', 'Please provide details of your crime', 	5, 	5,     'true');*/


insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '1', 'Maximum amount you wish to insure: ?',                                  2, 	 null,  null);
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '2', 'Is the above amount the Total Full Value of the goods being moved:',    3,      1,  null);
insert into answer_values(questionnaire_id, answer_value) values(2, 'Y');
insert into answer_values(questionnaire_id, answer_value) values(2, 'N');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '3', 'What is the Total Full Value of the goods being moved:?',               2,      2,   'N');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '4', 'For Additional Premium,Do you want first loss cover:?',                 3,   null,  null);
insert into answer_values(questionnaire_id, answer_value) values(4, 'Y');
insert into answer_values(questionnaire_id, answer_value) values(4, 'N');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '5', 'Do you use the service of a professional valuables carriers:?',         3,    null, null);
insert into answer_values(questionnaire_id, answer_value) values(5, 'Y');
insert into answer_values(questionnaire_id, answer_value) values(5, 'N');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '6', 'What is the name of the professional valuables carriers:?',             3,       5,  'Y');
insert into answer_values(questionnaire_id, answer_value) values(6, 'Protea Coin Service');
insert into answer_values(questionnaire_id, answer_value) values(6, 'G4S Service');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '7', 'By whom and how are the valuables carried:?',                           5,       5,  'N');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '8', 'How many times per week are the valuables carried:',                    3,    null,  null);
insert into answer_values(questionnaire_id, answer_value) values(8, '1');
insert into answer_values(questionnaire_id, answer_value) values(8, '2');
insert into answer_values(questionnaire_id, answer_value) values(8, '3');
insert into answer_values(questionnaire_id, answer_value) values(8, '4');
insert into answer_values(questionnaire_id, answer_value) values(8, '5');
insert into answer_values(questionnaire_id, answer_value) values(8, '6');
insert into answer_values(questionnaire_id, answer_value) values(8, '7');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '9', 'From where and to where are the valuables carried?',                    3,    null,  null);
insert into answer_values(questionnaire_id, answer_value) values(9, 'Port Elizabeth to Bloemfontein');
insert into answer_values(questionnaire_id, answer_value) values(9, 'Johannesburg to Durban');
insert into answer_values(questionnaire_id, answer_value) values(9, 'Polokwane to Mbombela');
insert into answer_values(questionnaire_id, answer_value) values(9, 'Rustenburg to Kimberley');
insert into answer_values(questionnaire_id, answer_value) values(9, 'Kimberley to Cape Town');
insert into answer_values(questionnaire_id, answer_value) values(9, 'Cape Town to Johannesburg ');
insert into answer_values(questionnaire_id, answer_value) values(9, 'Durban to Bloemfontein');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '10', 'What is the approximate distant?'                 ,                    3,    null,  null);
insert into answer_values(questionnaire_id, answer_value) values(10, '0km to 100km');
insert into answer_values(questionnaire_id, answer_value) values(10, '100km to 200km');
insert into answer_values(questionnaire_id, answer_value) values(10, '200km to 300km');
insert into answer_values(questionnaire_id, answer_value) values(10, '300km to 400km');
insert into answer_values(questionnaire_id, answer_value) values(10, '400km to 500km');
insert into answer_values(questionnaire_id, answer_value) values(10, '500km to 600km');
insert into answer_values(questionnaire_id, answer_value) values(10, '600km to 700km');
insert into questionnaires(product_id, sequence_number, question, answer_type_id, depends_on, on_answer)  values('1', '11', 'Do you require SASRIA cover?'                     ,                    3,    null,  null);
insert into answer_values(questionnaire_id, answer_value) values(11, 'Y');
insert into answer_values(questionnaire_id, answer_value) values(11, 'N');


