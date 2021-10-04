package miu.edu.activitytracking.bootstrap;

import miu.edu.activitytracking.domain.*;
import miu.edu.activitytracking.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ActivityTypeRepository activityTypeRepository;
    private final ActivityCategoryRepository activityCategoryRepository;
    private final ActivitySubCategoryRepository activitySubCategoryRepository;
    private final AddressRepository addressRepository;
    private final BeneficiaryRepository beneficiaryRepository;

    public BootStrapData(ActivityTypeRepository activityTypeRepository,
                         ActivityCategoryRepository activityCategoryRepository,
                         ActivitySubCategoryRepository activitySubCategoryRepository,
                         AddressRepository addressRepository,
                         BeneficiaryRepository beneficiaryRepository) {
        this.activityTypeRepository = activityTypeRepository;
        this.activityCategoryRepository = activityCategoryRepository;
        this.activitySubCategoryRepository = activitySubCategoryRepository;
        this.addressRepository = addressRepository;
        this.beneficiaryRepository = beneficiaryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        ActivityType training = new ActivityType("Training");
        ActivityType distribution = new ActivityType("Distribution");

        activityTypeRepository.save(training);
        activityTypeRepository.save(distribution);

        ActivityCategory genderTraining = new ActivityCategory("Gender Training", training.getId());
        ActivityCategory farmersTraining = new ActivityCategory("Farmers Training", training.getId());
        ActivityCategory foodDistribution = new ActivityCategory("Food Distribution", distribution.getId());
        ActivityCategory cashDistribution = new ActivityCategory("Cash Distribution", distribution.getId());

        activityCategoryRepository.save(genderTraining);
        activityCategoryRepository.save(farmersTraining);
        activityCategoryRepository.save(foodDistribution);
        activityCategoryRepository.save(cashDistribution);

        ActivitySubCategory familyPlanning = new ActivitySubCategory("Family Plannning", genderTraining.getId());
        ActivitySubCategory childRaising = new ActivitySubCategory("Child Raising", genderTraining.getId());

        ActivitySubCategory corn = new ActivitySubCategory("corn", foodDistribution.getId());
        ActivitySubCategory rice = new ActivitySubCategory("rice", foodDistribution.getId());
        ActivitySubCategory oil = new ActivitySubCategory("oil", foodDistribution.getId());

        activitySubCategoryRepository.save(familyPlanning);
        activitySubCategoryRepository.save(childRaising);
        activitySubCategoryRepository.save(corn);
        activitySubCategoryRepository.save(rice);
        activitySubCategoryRepository.save(oil);

        Address address1 = new Address("11th Street", "Fairfield", "57555", "Iowa", "USA");
        addressRepository.save(address1);
        Beneficiary beneficiary1 = new Beneficiary("Peter Smith", "M", LocalDate.of(1986, 10,10), address1);
        beneficiaryRepository.save(beneficiary1);

    }
}
