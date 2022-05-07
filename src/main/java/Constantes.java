public class Constantes {
    public String URL_BASE = "{\"query\":\"query {\\n  country(code:\\\"CA\\\")\\n  {\\n    code\\n    name\\n    native\\n    phone\\n    languages\\n    {\\n        code\\n        name\\n    }\\n  }\\n}\",\"variables\":{}}";
    public String URL_ERRADA = "{\"query\":\"query {\\n  country(code:\\\"CA\\\")\\n  {\\n    code\\n    name\\n    native\\n    phone\\n    languages\\n    {\\,\"variables\":{}}";
    public String METHOD_POST = "https://countries.trevorblades.com/";
    public String URL_BASE_NULL = "{\"query\":\"query {\\n  country(code:\\\"CA\\\")\\n  {\\n    code\\n    name\\n    native\\n    phone\\n    languages\\n    {\\n        code\\n        name\\n    }\\n  }\\n}\",\"variables\":{}}";
}
