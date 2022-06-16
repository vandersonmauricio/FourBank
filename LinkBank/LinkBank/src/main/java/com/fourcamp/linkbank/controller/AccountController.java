package com.fourcamp.linkbank.controller;

import com.fourcamp.linkbank.model.Account;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "account")
public class AccountController {
    @GetMapping("/balance")
    public Double getBalance(@RequestBody Account account) {

        try {
            if (account.getId() == null || account.getId() == 0) {
                return -1.0;
            }
        } catch (NullPointerException e) {
            return -1.0;
        }

        return 0.0;
    }

    @PutMapping("/deposit")
    public String getDeposit(@RequestBody Account account) {
        String message = "Depósito realizado com sucesso!";
        try {
            if (account.getId() == null || account.getId() == 0 || account.getBalance() == null || account.getBalance() == 0.0) {
                return "Não foi possível realizar o depósito!";
            }
        } catch (NullPointerException e) {
            return "Não foi possível realizar o depósito!";
        }
        return message;
    }

    @PutMapping("/transfer")
    public String getTransfer(@RequestBody Account account) {
        String message = "Transfêrencia realizada!";
        try {
            if (account.getAgency() == null || account.getBalance() == null) {
                return "Não foi possível realizar a tranferência";
            }
        } catch (NullPointerException e) {
            return "Não foi possível realizar a tranferência";
        }
        return message;
    }

    @PutMapping("/paybill")
    public String getPayBill(@RequestBody Account account) {
        String message = "Pagamento realizado com sucesso!";
        try {
            if (account.getNumber() == null || account.getAgency() == null) {
                return "O seu pagamento não foi realizado!";
            }
        } catch (NullPointerException e) {
            return "O seu pagamento não foi realizado!";
        }

        return message;
    }

    @GetMapping("/account/extract")
    public String getExtract(@RequestBody Account account) {
        String message = "Extrato!";
        try {
            if (account.getId() == null || account.getId() == 0) {
                return "Não foi possivel acessar seu extrato!";
            }
        } catch (NullPointerException e) {
            return "Não foi possivel acessar seu extrato!";
        }

        return message;
    }

    @PostMapping("/account/pix/email")
    public String pixEmail(@RequestBody Account account, @RequestParam(value = "email") String email) {
        String message = "Chave pix cadastrada com sucesso";
        try {
            if (account.getPix() == null || account.getPix().getEmail() == null) {
                return "Não foi possivel cadastrar chave pix!";
            }
        } catch (NullPointerException e) {
            return "Não foi possivel cadastrar chave pix!";
        }
        return message;
    }

    @PutMapping("/account/pix/email")
    public String pixEmail(@RequestBody Account account, @RequestParam(value = "email") String email, @RequestParam(value = "value") Double value) {
        String message = "Transferência pix feita com sucesso";
        try {
            if (account.getPix() == null || account.getPix().getEmail() == null) {
                return "Email inválido";
            }
        } catch (NullPointerException e) {
            return "Email inválido";
        }
        return message;
    }

    @DeleteMapping("/account/pix/email")
    public String pixEmail(@RequestBody Account account, @RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
        String message = "Chave deletada com sucesso";
        try {
            if (account.getPix() == null || account.getPix().getEmail() == null) {
                return "Senha ou cpf inválido";
            }
        } catch (NullPointerException e) {
            return "Senha ou cpf inválido";
        }
        return message;
    }

    @PostMapping("/account/pix/cpf")
    public String pixCpf(@RequestBody Account account, @RequestParam(value = "cpf") String cpf) {
        String message = "Chave cadastrada com sucesso (CPF)";
        try {
            if (account.getPix() == null || account.getPix().getCpf() == null) {
                return "Não foi possivel cadastrar chave pix!";
            }
        } catch (NullPointerException e) {
            return "Não foi possivel cadastrar chave pix!";
        }
        return message;
    }

    @PutMapping("/account/pix/cpf")
    public String pixCpf(@RequestBody Account account, @RequestParam(value = "cpf") String cpf, @RequestParam(value = "value") Double value) {
        String message = "Transferência realizada com sucesso!";
        try {
            if (account.getPix() == null || account.getPix().getCpf() == null) {
                return "Cpf inválido";
            }
        } catch (NullPointerException e) {
            return "Cpf inválido";
        }
        return message;
    }

    @DeleteMapping("/account/pix/cpf")
    public String pixCpf(@RequestBody Account account, @RequestParam(value = "cpf") String cpf, @RequestParam(value = "password") String password) {
        String message = "Chave deletada com sucesso";
        try {
            if (account.getPix() == null || account.getPix().getCpf() == null) {
                return "Senha ou email inválido";
            }
        } catch (NullPointerException e) {
            return "Senha ou email inválido";
        }
        return message;
    }

    @PostMapping("/account/pix/cellphone")
    public String pixCellPhone(@RequestBody Account account, @RequestParam(value = "cellphone") String cellphone) {
        String message = "Chave cadastrada com sucesso!";
        try {
            if (account.getPix() == null || account.getPix().getCellphone() == null) {
                return "Não foi possível cadastrar chave pix!";
            }
        } catch (NullPointerException e) {
            return "Não foi possível cadastrar chave pix!";
        }
        return message;
    }
    @PutMapping("/account/pix/cellphone")
    public String pixCellPhone(@RequestBody Account account, @RequestParam(value = "cellphone") String cpf, @RequestParam(value = "value") Double value) {
        String message = "Transferência realizada com sucesso!";
        try {
            if (account.getPix() == null || account.getPix().getCellphone() == null) {
                return "Telefone inválido";
            }
        } catch (NullPointerException e) {
            return "Telefone inválido";
        }
        return message;
    }
    @DeleteMapping("/account/pix/cellphone")
    public String pixCellPhone(@RequestBody Account account, @RequestParam(value = "cellphone") String cpf, @RequestParam(value = "password") String password) {
        String message = "Chave deletada com sucesso";
        try {
            if (account.getPix() == null || account.getPix().getCellphone() == null) {
                return "Senha ou telefone inválido";
            }
        } catch (NullPointerException e) {
            return "Senha ou telefone inválido";
        }
        return message;
    }
}



