<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" version="1.0" encoding="UTF-8" indent="yes" />

    <xsl:template match="/">
        <html>
            <head>
                <title>Ventes</title>
            </head>
            <body bgcolor="lightgray">
                <h1>Bilan</h1>
                <hr color="redwine" size="2"/>
                <table>
                    <tr valign="top">
                        <xsl:apply-templates/>
                    </tr>
                </table>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="magasin">
        <td>
            <table border="1">
                <tbody>
                    <tr>
                        <th bgcolor="red" align="center"><xsl:value-of select="@nom"/></th>
                        <th bgcolor="red" colspan="2" align="center"><xsl:value-of select="@region"/></th>
                    </tr>
                    <xsl:apply-templates/>
                </tbody>
            </table>
        </td>
    </xsl:template>

    <xsl:template match="trimestre">
        <tr>
            <td bgcolor="yellow" align="center"><xsl:value-of select="@numero"/></td>
            <td bgcolor="yellow" colspan="2" align="center"><xsl:value-of select="@annee"/></td>
        </tr>
        <xsl:variable name="max" select="./article[1]/qte * ./article[1]/pu"/>
        <xsl:variable name="reference" select="./article[1]/@ref"/>
        <xsl:for-each select="./article">
            <xsl:if test="$max &lt; qte * pu">
                <xsl:variable name="max" select="qte * pu"/>
                <xsl:variable name="reference" select="@ref"/>
            </xsl:if>
        </xsl:for-each>
        <xsl:apply-templates select="./article">
            <xsl:with-param name="ref" select="$reference"/>
        </xsl:apply-templates>
    </xsl:template>

    <xsl:template match="article[position() mod 2 = 0]">
        <xsl:param name="ref"/>
        <tr>
            <xsl:choose>
                <xsl:when test="$ref = @ref">
                    <td bgcolor="lightblue" align="center"><u><xsl:value-of select="@ref"/></u></td>
                </xsl:when>
                <xsl:otherwise>
                    <td bgcolor="lightblue" align="center"><xsl:value-of select="@ref"/></td>
                </xsl:otherwise>
            </xsl:choose>
            <td bgcolor="lightblue" align="right"><xsl:value-of select="pu"/></td>
            <td bgcolor="lightblue" align="right"><xsl:value-of select="qte"/></td>
        </tr>
    </xsl:template>

    <xsl:template match="article[position() mod 2 = 1]">
        <xsl:param name="ref"/>
        <tr>
            <xsl:choose>
                <xsl:when test="$ref = @ref">
                    <td bgcolor="lightcoral" align="center"><u><xsl:value-of select="@ref"/></u></td>
                </xsl:when>
                <xsl:otherwise>
                    <td bgcolor="lightcoral" align="center"><xsl:value-of select="@ref"/></td>
                </xsl:otherwise>
            </xsl:choose>
            <td bgcolor="lightcoral" align="right"><xsl:value-of select="pu"/></td>
            <td bgcolor="lightcoral" align="right"><xsl:value-of select="qte"/></td>
        </tr>
    </xsl:template>

</xsl:stylesheet>