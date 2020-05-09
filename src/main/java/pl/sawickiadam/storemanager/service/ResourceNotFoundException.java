package pl.sawickiadam.storemanager.service;

public class ResourceNotFoundException extends Exception {
    private static final long serialVersionUID = 1;

    public ResourceNotFoundException(Object resourceId) {
        super(resourceId != null ? resourceId.toString() : null);
    }
}