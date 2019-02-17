package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserClient.class)
public abstract class UserClient_ {

	public static volatile SingularAttribute<UserClient, String> firstName;
	public static volatile SingularAttribute<UserClient, String> password;
	public static volatile SingularAttribute<UserClient, String> address;
	public static volatile SingularAttribute<UserClient, Integer> phoneNumber;
	public static volatile CollectionAttribute<UserClient, Event> reservations;
	public static volatile SingularAttribute<UserClient, String> name;
	public static volatile SingularAttribute<UserClient, Long> id;

}

