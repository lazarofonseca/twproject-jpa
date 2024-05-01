package br.com.treinaweb.twprojects.web.employees.mappers;

import br.com.treinaweb.twprojects.core.models.Address;
import br.com.treinaweb.twprojects.web.employees.dtos.AddressForm;

public interface AddressMapper {

    AddressForm toAddresForm(Address address);

    Address toAddres(AddressForm addressForm);

    String formatAddress(Address address);

}
