package com.example.securityrole;
/*opnotFound */
class OprendszerekNotFoundException extends RuntimeException {
    OprendszerekNotFoundException(Long id) {
        super("A szoftver nem található: " +id);
    }
}